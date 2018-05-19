# OkHttp

## Dispatcher

其线程的执行过程:(具体的还是看类注解)

### 同步调用

即调用RealCall的execute()方法

RealCall.execute()
|
|
V
Dispatcher.execute(ReadlCall):添加到同步双端队列，这里只是添加不执行
|
|
V
RealCall.getResponseWithInterceptorChain():执行请求
|
|
V
Dispatcher.finished()

### 异步调用

即调用RealCall的enqueue()方法

RealCall.enqueue(AsyncCall):将请求放到异步队列
|
|
V
此时放到线程池中执行AsyncCall的run方法(实质是execute()方式)
|
|
V
RealCall.getResponseWithInterceptorChain()
|
|
V
根据执行结果执行方法回调
|
|
V
Dispatcher.finished():这里适合同步方法不同的是,会执行Dispatcher.promoteCalls(),将等待队列中的任务添加到线程池中

-----

其正在的执行过程是一致的都是要用RealCall.getResponseWithInterceptorChain(),这个方法就是真正请求执行的核心.而Dispatcher的作用就是存储执行的任务和线程池.

