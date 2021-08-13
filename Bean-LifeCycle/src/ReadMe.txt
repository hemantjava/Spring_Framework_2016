Note:bean life cycle maintain by the Spring container if we want to called explicitly
for perform some addition task . 

Bean life cycle method we can called init and destroy methods by using three approach:--
-------------------------------------------------------------
1)To Interfaces(as in implemented class)
   a)InitializingBean-->afterPropertiesSet()
   b)DisposableBean-->destroy()
  
 2)To Xml (as a bean attributes)
     a)init-method="mname"
     b)destroy-method="mname"  
     
3)To annotations (as annotated methods)
     a)PostConstruct
     b)PreDestroy      