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
    CUSTOM：自定义过滤条件（classes传入自定义类（实现TypeFilter））,详情见myScanFilter
        在自定义过滤条件中，过滤类相当于过滤器一样，在扫描当前类时会调用过滤类，判断是否满足逻辑，满足扫描进容器，反之不扫描
    定义Bean的作用域
        @Scope("singleton")
            单例模式（默认），容器启动会将方法一起加载进容器，在每次使用时都会去容器中用map.get()获取（所获取的对象一直是一个）
        @Scope("prototype")
            多例模式，容器启动时不会将方法一起加载进容器，每次获取时会创建新的对象，每次获取时才会调用方法
     懒加载
        @LAZY：由于单例模式是在加入容器中创建对象，在通过@Bean来添加Bean的方法上@LAZY是该Bean只有在使用时（获取Bean）才会创建
     @Conditional：进行条件判断，若条件满足则将其中的@Bean加入容器（可加在类和方法上）
        @Conditional({myCondition.class})：传入一个Condition的实现类，类中写判断逻辑
     @Import
        @Import({})：直接传入想加入容器的全类名
        @Import({myImportSelector.class})：传入ImportSelector的实现类，类中的selectImport方法返回想加入容器的Bean的全类名数组
        @Import({myImportBeanDefinitionRegistrar.class})：传入ImportBeanDefinitionRegistrar的实现类，通过参数BeanDefinitionRegistry registry将Bean加入容器
     实现FactoryBean（使用getObject，getObjectType方法，将想制造的类及类的类型传入方法返回值中），并将其放入容器中，从容器中获取该Bean为getObject制造的类
     Bean的生命周期
        初始化：在容器开启时
        销毁：在容器关闭时
        初始化方法和销毁方法的定义
            1.@Bean( initMethod = "init",destroyMethod = "destroy")
            2.实体类实现InitializingBean, DisposableBean，重写afterPropertiesSet，destroy方法
            3.实体类定义初始化方法和销毁方法，并在方法上使用@PostConstruct和@PreDestroy标签
    实现BeanPostProcess接口（需要加入容器中）（类似Bean的拦截器）：其中存在方法postProcessBeforeInitialization,postProcessAfterInitialization，自定义容器中所有Bean初始化前后的操作
    参数注入：使用@Value(),可传定值，SpEL，${}（在配置类使用@PropertySource(value = "")引入配置文件）
             springBoot提供了@ConfigurationProperties(prefix = "user")来进行整体注入
    接口Aware下存在很多接口xxxAware（如ApplicationContextAware，BeanNameAware），让类实现这些接口（重写接口下的方法，会让该类在加载时获得spring底层的一些组件）
    原理：如ApplicationContextAware的实现是ApplicationContextAwareProcessor在类初始化之前将ioc容器装进类中
    自动装配：@Autowired自动装配对应类型，若有多个相同类型，默认装配类型小写的
             在多个相同类型环境下，使用 @Autowired @Qualifier(bean名称)进行指定的装配
             在多个相同类型环境下，@Primary指定某个类优先装配，在没有指定装配时，装配该类
    环境切换：@Profile，将在此注解下的Bean在对应环境下加载进容器中
    在spring的配置文件处spring.profiles.active=test来定义当前环境
2.扩展原理
3.web

