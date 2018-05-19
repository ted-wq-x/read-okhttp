注意这是学习笔记,项目原地址[okhttp](https://github.com/square/okhttp)

# Listener的设计

Listener的设计在这个版本中还没有完成.

主要是通过EventListener这个抽象类完成的,具体的调用位置在具体的代理中,在目前看来这个设计还是比较随意的

## TODO

1. 何时关闭socket的
2. 这整理下从socket到buffer/sink的流程，主要是CallServerInterceptor下面的流程

