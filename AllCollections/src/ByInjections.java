
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//all collection support by spf list,set,map,Properties,array
public class ByInjections {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"context.xml");
		AllCollection b = (AllCollection) ap.getBean("b");
		List<Object> l = b.getLs();
		System.out.println("list:" + l);
		Map<Object,Object> m = b.getMp();
		System.out.println("Map:" + m);
		Properties p = b.getPt();
		System.out.println("props:" + p);
		Set<Object> ss = b.getSt();
		System.out.println("set:" + ss);
		System.out.println("--------list----------");
		for (Object o : l)
			System.out.println(o);
		System.out.println("--------set----------");
		for (Object o : ss)
			System.out.println(o);
		System.out.println("--------props----------");
		Set set = p.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + " " + me.getValue());
		}
		System.out.println("--------map.entrySet()----------");
		Set set1 = m.entrySet();
		Iterator it1 = set1.iterator();
		while (it1.hasNext()) {
			Map.Entry me1 = (Map.Entry) it1.next();
			System.out.println(me1.getKey() + " " + me1.getValue());

		}
		System.out.println("--------map.keySet()----------");
		Set<Object> set2 = m.keySet();
		for (Object o : set2)
			System.out.println(o + " " + m.get(o));
		System.out.println("------------array-----------------");
		for (Object object : b.getVal()) {
			System.out.println(object);
			
		}

	}

}
