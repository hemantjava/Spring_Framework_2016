/*spring bean have to approach to maintain bean life cycle 
 * 1st:-
 * user defined init and destroy methods
 * and configure <bean init-method="mname" destroy-method="mname">
 * 
 * 2nd:-
 * by implementing 2 interfaces
 * InitializingBean,DisposableBean and respectively their methods afterPropertiesSet and destroy
 * 
 * Note:- if use both at time then interface given methods executed 1st
 * then executed user defined methods 
 NOte:- bean life cycle executed after 1). bean object instantiated and 2).injection is injected
 */