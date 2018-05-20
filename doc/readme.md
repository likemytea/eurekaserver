spring cloud demo
1、先通过 start.spring.io新建一个工程
2、史上最简单的 SpringCloud 教程 | 第一篇： 服务的注册与发现（Eureka） 
  http://blog.csdn.net/forezp/article/details/69696915
3、如果项目编译后出现 Archive for required library:  cannot be read or is not a valid ZIP file ，把提示的jar删掉，然后重新编译。
4、版本号 ，这个很重要，配置的不对可能出现各种稀奇的异常， 
    org.springframework.boot  1.5.9.RELEASE
    org.springframework.cloud  Dalston.SR4
使用zuul路由到了ribbon消费服务      http://localhost:8769/api-a/nihao?name=%E5%88%98%E5%85%B4&token=22
使用zuul路由到了feign消费服务       http://localhost:8769/api-b/hi?name=%E5%88%98%E5%85%B4&token=22
    