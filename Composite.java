import java.util.ArrayList;

public  class Composite implements Component {
	public static int count=1;
	private ArrayList <Component> list=new ArrayList<Component>();
	
	
	public void add(Component a){
		list.add(a);
	}
	
	public void remove(Component a){
		list.remove(a);
	}
	
	@Override
	public void print() {
		for(Component a:list){
			a.print();
			
			System.out.print(this.toString());
			System.out.println();
		}

	}
	
	public String toString(){
		return "Das ist das" +count+ ". Komposite";
		
	}
	
	public static void main(String[] args) {
		Component a=new Leaf();
		Component b=new Leaf();
		Component c=new Leaf();
		Component e=new Leaf();
		Component f=new Leaf();
		Component g=new Leaf();
		Composite composite=new Composite();
		Composite composite2=new Composite();
		composite2.add(e);
		composite2.add(f);
		composite2.add(g);
		composite.add(composite2);
		composite.add(a);
		composite.add(b);
		composite.add(c);
		composite.print();
	}

}
