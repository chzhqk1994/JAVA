package yunjoo;

public class Controller {
	  public int ��ⱹ����, ��ġ������, �ᱹ����, ���뱹���, �ع�����, 
	            �ع�������, �ſ�����, ���������, �հ�, ���ξ�, ���ɾ�;
		
	  private CalDiscount discount;
	  private CalSum sum;
		
	  public Controller(){
	    discount = new CalDiscount();
	    sum = new CalSum();
	  }
		
	  public void set����(int c��ⱹ����, int c��ġ������, int c�ᱹ����, int c���뱹���, int c�ع�����, int c�ع�������, int c�ſ�����, int c���������){
	    ��ⱹ���� = c��ⱹ����;
	    ��ġ������ = c��ġ������;
	    �ᱹ���� = c�ᱹ����;
	    ���뱹��� = c���뱹���;
	    �ع����� = c�ع�����;
	    �ع������� = c�ع�������;
	    �ſ����� = c�ſ�����;
	    ��������� = c���������;	
	  }
		
	  public void ���(){
	    sum.set����(��ⱹ����, ��ġ������, �ᱹ����, ���뱹���, �ع�����, �ع�������, 
			�ſ�����, ���������);
	    �հ� = sum.calSum();
	    discount.calReceipt(�հ�);
	    ���ξ� = discount.get���ξ�();
	    ���ɾ� = discount.get���ɾ�();
	  }
	}