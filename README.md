# spring boot 3.2.2 template

- [x] Virtual Thread([ref](https://spring.io/blog/2023/09/09/all-together-now-spring-boot-3-2-graalvm-native-images-java-21-and-virtual))
- [x] Swagger([ref](https://springdoc.org/))
- [x] Jpa([ref](https://easywritten.com/post/using-spring-boot-3-with-zipkin/))
- [x] MyBatis([ref](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/))
- [x] P6spy([ref](https://github.com/gavlyukovskiy/spring-boot-data-source-decorator))
- [x] Actuator(prometheus, zipkin)([ref](https://easywritten.com/post/using-spring-boot-3-with-zipkin/))
- [x] Eureka client([ref](https://cloud.spring.io/spring-cloud-netflix/multi/multi__service_discovery_eureka_clients.html))
- [x] CORS(WebMvcConfigurer)([ref](https://jake-seo-dev.tistory.com/605))
- [x] MapStruct(Model Mapping)([ref](https://mapstruct.org/documentation/stable/reference/html/))
- [x] CheckStyle(Google)([ref](https://checkstyle.sourceforge.io/google_style.html))
- [x] Intellij Code Style(Google)([ref](https://github.com/google/styleguide/blob/gh-pages/intellij-java-google-style.xml))
- [x] ExceptionHandler
- [ ] Jacoco([ref](https://docs.gradle.org/current/userguide/jacoco_plugin.html))

## Issue1. LoadBalancer
```
WARN  24-02-26 20:14:364[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[429]: - Bean 'org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration$LoadBalancerInterceptorConfig' of type [org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration$LoadBalancerInterceptorConfig] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). The currently created BeanPostProcessor [lbRestClientPostProcessor] is declared through a non-static factory method on that class; consider declaring it as static instead.
WARN  24-02-26 20:14:367[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'org.springframework.cloud.loadbalancer.config.BlockingLoadBalancerClientAutoConfiguration' of type [org.springframework.cloud.loadbalancer.config.BlockingLoadBalancerClientAutoConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:370[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'org.springframework.cloud.loadbalancer.config.LoadBalancerAutoConfiguration' of type [org.springframework.cloud.loadbalancer.config.LoadBalancerAutoConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:381[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'org.springframework.cloud.commons.config.CommonsConfigAutoConfiguration' of type [org.springframework.cloud.commons.config.CommonsConfigAutoConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:384[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'org.springframework.cloud.client.loadbalancer.LoadBalancerDefaultMappingsProviderAutoConfiguration' of type [org.springframework.cloud.client.loadbalancer.LoadBalancerDefaultMappingsProviderAutoConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:386[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'loadBalancerClientsDefaultsMappingsProvider' of type [org.springframework.cloud.client.loadbalancer.LoadBalancerDefaultMappingsProviderAutoConfiguration$$Lambda/0x00000262d848ce88] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:389[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'defaultsBindHandlerAdvisor' of type [org.springframework.cloud.commons.config.DefaultsBindHandlerAdvisor] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:397[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'spring.cloud.loadbalancer-org.springframework.cloud.client.loadbalancer.LoadBalancerClientsProperties' of type [org.springframework.cloud.client.loadbalancer.LoadBalancerClientsProperties] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:407[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'default.org.springframework.cloud.loadbalancer.config.LoadBalancerAutoConfiguration.LoadBalancerClientSpecification' of type [org.springframework.cloud.loadbalancer.annotation.LoadBalancerClientSpecification] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:409[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'default.org.springframework.cloud.loadbalancer.config.BlockingLoadBalancerClientAutoConfiguration.LoadBalancerClientSpecification' of type [org.springframework.cloud.loadbalancer.annotation.LoadBalancerClientSpecification] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:410[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'default.org.springframework.cloud.netflix.eureka.loadbalancer.LoadBalancerEurekaAutoConfiguration.LoadBalancerClientSpecification' of type [org.springframework.cloud.loadbalancer.annotation.LoadBalancerClientSpecification] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:411[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'loadBalancerClientFactory' of type [org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:420[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'blockingLoadBalancerClient' of type [org.springframework.cloud.loadbalancer.blocking.client.BlockingLoadBalancerClient] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:430[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'loadBalancerServiceInstanceCookieTransformer' of type [org.springframework.cloud.loadbalancer.core.LoadBalancerServiceInstanceCookieTransformer] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:433[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'xForwarderHeadersTransformer' of type [org.springframework.cloud.loadbalancer.blocking.XForwardedHeadersTransformer] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:435[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration' of type [org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:438[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'loadBalancerRequestFactory' of type [org.springframework.cloud.client.loadbalancer.LoadBalancerRequestFactory] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
WARN  24-02-26 20:14:440[restartedMain] org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker.postProcessAfterInitialization[437]: - Bean 'loadBalancerInterceptor' of type [org.springframework.cloud.client.loadbalancer.LoadBalancerInterceptor] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [lbRestClientPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
```

- 참조 : [BeanPostProcessors not registered correctly when @LoadBalanced bean instantiated in auto-configuration #1315](https://github.com/spring-cloud/spring-cloud-commons/issues/1315)
- 해결 : `spring-cloud-commons:4.1.1` 적용([참조](https://spring.io/blog/2024/01/23/spring-cloud-commons-4-1-1-has-been-released))
```groovy
dependencies {
    implementation 'org.springframework.cloud:spring-cloud-commons:4.1.1'
}
```
- 차후 spring-cloud-dependencies `2023.0.1` 버전 Release 시 `spring-cloud-commons:4.1.1` 적용 예정이므로 추후 변경 필요

## Issue2. Caffeine Cache
```
WARN  24-02-26 20:14:059[restartedMain] org.springframework.cloud.loadbalancer.config.LoadBalancerCacheAutoConfiguration$LoadBalancerCaffeineWarnLogger.afterPropertiesSet[94]: - Spring Cloud LoadBalancer is currently working with the default cache. While this cache implementation is useful for development and tests, it's recommended to use Caffeine cache in production.You can switch to using Caffeine cache, by adding it and org.springframework.cache.caffeine.CaffeineCacheManager to the classpath.
```
- 참조 : [Spring Cloud LoadBalancer Caching](https://docs.spring.io/spring-cloud-commons/reference/spring-cloud-commons/loadbalancer.html#loadbalancer-caching)

- 해결 : `caffeine` 적용
```groovy

dependencies {
    implementation 'com.github.ben-manes.caffeine:caffeine:3.1.8'
}
```

## etc
### Spring Boot 3.0
- [Java의 미래, Virtual Thread](https://techblog.woowahan.com/15398/)
- [실전! Spring Boot 3 마이그레이션](https://techblog.lycorp.co.jp/ko/how-to-migrate-to-spring-boot-3)

### Swagger
- [Spring Boot 3 버전 Swagger OpenAPI 3 적용과 커스터마이징](https://velog.io/@rurry/Spring-Boot-3-%EB%B2%84%EC%A0%84-Swagger-OpenAPI-3-%EC%A0%81%EC%9A%A9%EA%B3%BC-%EC%BB%A4%EC%8A%A4%ED%84%B0%EB%A7%88%EC%9D%B4%EC%A7%95)
- [Spring Boot + Swagger 3 example (with OpenAPI 3)](https://www.bezkoder.com/spring-boot-swagger-3/)

### JPA(Hibernate)
- [[Spring Boot] Application.yml 설정 - Hibernate – SQL Dialects](https://hermeslog.tistory.com/682)

### Map Struct
- [[Spring] mapstruct 사용법 (with custom method로 매핑)](https://marklee1117.tistory.com/121)

### Checkstyle
- [Spring Boot 3 × Java 21にGradleでCheckStyleを適用する](https://n-laboratory.jp/articles/springboot-gradle-checkstyle)
- [Google Android Platform checkstyle Suppressions](https://android.googlesource.com/platform/external/checkstyle/+/HEAD/config/suppressions.xml)
