package go;

public class TestGou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ����
		Gou d1=new Gou();
		//��������
		d1.name="��ͷ";
		d1.color="��ɫ";
		d1.age=5;
		System.out.println(d1.name+"�����ǣ�"+d1.name);
		System.out.println("��ɫ�ǣ�"+d1.color);
		System.out.println("�����ǣ�"+d1.age);
		//������Ϊ
		d1.Jiao();
		d1.Chi();
		d1.JieShao();
		
		//������һ����
		Gou d2=new Gou();
		//��������
		d2.name="����";
		d2.color="��ɫ";
		d2.age=8;
		System.out.println("�����ǣ�"+d2.name);
		System.out.println("��ɫ�ǣ�"+d2.color);
		System.out.println("�����ǣ�"+d2.age);
		//������Ϊ
		d2.Jiao();
		d2.Chi();
		d2.JieShao();
	}

}
