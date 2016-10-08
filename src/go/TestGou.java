package go;

public class TestGou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一条狗
		Gou d1=new Gou();
		//定义属性
		d1.name="馒头";
		d1.color="白色";
		d1.age=5;
		System.out.println(d1.name+"名字是："+d1.name);
		System.out.println("颜色是："+d1.color);
		System.out.println("年龄是："+d1.age);
		//定义行为
		d1.Jiao();
		d1.Chi();
		d1.JieShao();
		
		//定义另一条狗
		Gou d2=new Gou();
		//定义属性
		d2.name="包子";
		d2.color="花色";
		d2.age=8;
		System.out.println("名字是："+d2.name);
		System.out.println("颜色是："+d2.color);
		System.out.println("年龄是："+d2.age);
		//定义行为
		d2.Jiao();
		d2.Chi();
		d2.JieShao();
	}

}
