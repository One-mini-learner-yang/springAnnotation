1.容器
    扫描包
    @ComponentScan(value = "com.yang.spring_annotation",includeFilters = {
            @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {}),
            @ComponentScan.Filter(type = FilterType.ASPECTJ ,classes = {}),
            @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {}),
            @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {}),
            @ComponentScan.Filter(type = FilterType.REGEX,classes = {})
    },excludeFilters = {},useDefaultFilters = false)
    包括扫描与不包括扫描的过滤规则一致
    ANNOTATION：对指定的注解进行过滤（classes中传注解类）
    ASSIGNABLE_TYPE：对指定类进行过滤（classes中传对应类）
    ASPECTJ：用aspectj语法进行过滤
    REGEX：用正则表达式过滤
    CUSTOM：自定义过滤条件（classes传入自定义类（实现TypeFilter））
        在自定义过滤条件中，过滤类相当于过滤器一样，在扫描当前类时会调用过滤类，判断是否满足逻辑，满足扫描进容器，反之不扫描
    定义Bean的作用域
        @Scope("singleton")
            单例模式（默认），容器启动会将方法一起加载进容器，在每次使用时都会去容器中用map.get()获取（所获取的对象一直是一个）
        @Scope("prototype")
            多例模式，容器启动时不会将方法一起加载进容器，每次获取时会创建新的对象，每次获取时才会调用方法
2.扩展原理
3.web

