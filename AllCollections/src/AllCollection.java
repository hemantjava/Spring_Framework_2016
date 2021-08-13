import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AllCollection {
	private List<Object> ls;
	private Set<Object> st;
	private Map<Object,Object> mp;
	private Properties pt;
	private int val[];

	
	public int[] getVal() {
		return val;
	}

	public void setVal(int[] val) {
		this.val = val;
	}

	public List<Object> getLs() {
		return ls;
	}

	public void setLs(List<Object> ls) {
		this.ls = ls;
	}

	public Set<Object> getSt() {
		return st;
	}

	public void setSt(Set<Object> st) {
		this.st = st;
	}

	public Map<Object, Object> getMp() {
		return mp;
	}

	public void setMp(Map<Object, Object> mp) {
		this.mp = mp;
	}

	public Properties getPt() {
		return pt;
	}

	public void setPt(Properties pt) {
		this.pt = pt;
	}

}
