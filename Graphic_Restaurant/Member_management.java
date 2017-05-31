
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.table.*; 
import java.awt.event.*;



public class Member_management extends JFrame implements ActionListener {
	
	JLabel label,id, name, phone,address,company;	
	JTextField fid,fname,fphone,faddress,fcompany,search;
	JButton add,delete,update,clear,all,sbutton;

	String items[] = {"�̸�","�ּ�","ȸ��"};

	JComboBox combo;
	JPanel bottompanel,leftpanel,center,pid,pname,pphone,padd,pcom;
	JScrollPane sp;		

	Vector outer,title, noresult, msg ; //noresult :�˻���������� ���̺�����

	JTable table;

	DefaultTableModel model;



	String connect = new String("jdbc:oracle:thin:@localhost:1521:xe");

	String user = new String("scott");

	String passwd = new String("tiger");



	Connection conn;

	Statement stat;

	PreparedStatement prestat1, prestat2, prestat3;

	ResultSet rs;



	public Member_management(){

		makeGui(); //ȭ�鱸��

		prepareDB(); //db �غ��۾�

		select(null); //ùȭ�鿡�� ���̺��� ��� ���뺸���ֱ� ���� select�ϴ� �Լ�

		model.setDataVector(outer, title);

		

	}



	public void makeGui(){	



		label = new JLabel("Address Book",JLabel.CENTER);

		id = new JLabel("   I D :  ",JLabel.CENTER);



		fid = new JTextField(15);

		pid = new JPanel();

		pid.add(id);

		pid.add(fid);



		name = new JLabel("�̸� : ");

		fname = new JTextField(15);

		pname = new JPanel();

		pname.add(name);

		pname.add(fname);



		phone = new JLabel("��ȭ : ");

		fphone = new JTextField(15);

		pphone = new JPanel();

		pphone.add(phone);

		pphone.add(fphone);



		address = new JLabel("�ּ� : ");

		faddress = new JTextField(15);

		padd = new JPanel();

		padd.add(address);

		padd.add(faddress);



		company = new JLabel("ȸ�� : ");

		fcompany = new JTextField(15);

		pcom = new JPanel();

		pcom.add(company);

		pcom.add(fcompany);

		

		leftpanel = new JPanel();

		leftpanel.setLayout(new GridLayout(5,1));

		leftpanel.add(pid);

		leftpanel.add(pname);

		leftpanel.add(pphone);

		leftpanel.add(padd);

		leftpanel.add(pcom);



		add = new JButton("�߰�");

		add.addActionListener(this);

		delete = new JButton("����");

		delete.addActionListener(this);

		update = new JButton("����");

		update.addActionListener(this);



		combo = new JComboBox(items);

		

		search = new JTextField(15);

		search.addActionListener(this);



		sbutton = new JButton("�˻�");

		sbutton.addActionListener(this);



		clear = new JButton("�����");

		clear.addActionListener(this);

		all = new JButton("��ü����");

		all.addActionListener(this);

		

		bottompanel = new JPanel();

		bottompanel.add(add);

		bottompanel.add(delete);

		bottompanel.add(update);

		bottompanel.add(combo);

		bottompanel.add(search);

		bottompanel.add(sbutton);

		bottompanel.add(clear);

		bottompanel.add(all);		

		

		title = new Vector();

		outer = new Vector();		

		noresult = new Vector();		

		msg = new Vector();		



		title.add("ID");

		title.add("Name");

		title.add("Phone");

		title.add("Address");

		title.add("Company");



		noresult.add("���� ���");



		addWindowListener(new WindowAdapter(){

			@Override

			public void windowClosing(WindowEvent w) {

				

				try {

					rs.close();

					stat.close();

					conn.close();

					

					setVisible(false);

					dispose();

					System.exit(0);

				} catch (Exception e) {

					// TODO Auto-generated catch block

					e.printStackTrace();

				}

				

				super.windowClosing(w);

			}

		});		



		Container c = getContentPane();

		

		// DefaultTableModel ����

		model = new DefaultTableModel();

		

		

		//model ����ؼ� JTable ����

		table = new JTable(model);

		

		

		table.addMouseListener(new MouseAdapter(){

			public void mouseClicked(MouseEvent me){

				//Ŭ���� ���� �ε��� �˾Ƴ���-->JTable�� �޼ҵ�

				   int index = table.getSelectedRow();

				  

				   

				  //�ε��� �̿��ؼ� out���� ���� ���� in ������

				   Vector msg = (Vector) outer.get(index);

				   

				  //in �ȿ� ��� �ִ� ��ȣ,�̸�,�ּ� �˾Ƴ��� �ؽ�Ʈ �ʵ忡 �־��ֱ�

				   String id = (String) msg.get(0);

				   String name = (String) msg.get(1);

				   String phone = (String) msg.get(2);	

				   String address = (String) msg.get(2);	

				   String company = (String) msg.get(2);	

				   

				   

				   fid.setText(id);

				   fname.setText(name);

				   fphone.setText(phone);

				   faddress.setText(address);

				   fcompany.setText(company);

				   

				  //��ȣ�� ���� �ؽ�Ʈ �ʵ�� ���� �Ұ� ���·� ����

				   fid.setEditable(false);

			}

		});



		sp = new JScrollPane(table);



		center = new JPanel();

		center.add(leftpanel);

		center.add(sp);



		c.add(label,"North");

		c.add(center,"Center");	

		c.add(bottompanel,"South");					

	}

	

	public void prepareDB(){



			

			//Statement

			//PreparedStatement		

		

		 try {

				//driver ���

				Class.forName("oracle.jdbc.driver.OracleDriver");	//��ü ����

					

				//connection ���

				conn = DriverManager.getConnection(connect, user, passwd);

					

					

				//statement ���

				stat = conn.createStatement();

					

				prestat1 = conn.prepareStatement("insert into addressBook values(?,?,?,?,?)");

				prestat2 = conn.prepareStatement("delete from addressBook where id = ?");

				prestat3 = conn.prepareStatement("update addressBook set name=?,phone=?,address=?,company=?" +

						" where id = ?");

				

				/*pin = conn.prepareStatement("insert into customer values(?,?,?)");

				pdel = conn.prepareStatement("delete from customer where num= ?");

				pup = conn.prepareStatement("update customer set name=?,address=? where num=?");*/



			} catch (Exception e) {

				

			}

		

	}

	

	public void add(){

		String id = fid.getText();

		String name = fname.getText();

		String phone = fphone.getText();

		String address = faddress.getText();

		String company = fcompany.getText();

		

		try {

			prestat1.setString(1, id);

			prestat1.setString(2, name);

			prestat1.setString(3, phone);

			prestat1.setString(4, address);

			prestat1.setString(5, company);

			

			prestat1.executeUpdate();

			

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		



	}



	public void delete(){

		String id = fid.getText();

		

		try {

			prestat2.setString(1, id);

						

			prestat2.executeUpdate();

			

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}



	public void update(){

		

		String id = fid.getText();

		String name = fname.getText();

		String phone = fphone.getText();

		String address = faddress.getText();

		String company = fcompany.getText();

		

		try {

			prestat3.setString(1, name);

			prestat3.setString(2, phone);

			prestat3.setString(3, address);

			prestat3.setString(4, company);

			prestat3.setString(5, id);

			

			prestat3.executeUpdate();

			

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

	

	public void search(){

		

		

		String keyword = search.getText();

		

		int i = combo.getSelectedIndex();

		

		String index;

		if(i==0)

			index = "name";

		else if(i==1)

			index = "address";

		else

			index = "company";

		

		String q = "select * from addressBook where "+index+"='"+keyword+"' order by id";

		select(q);

		search.setText("");

	}

	

	public void clear(){		

		fid.setText("");

		fname.setText("");

		fphone.setText("");

		faddress.setText("");

		fcompany.setText("");		

		fid.setEditable(true);

	}



	public void select(String query){

		try{

			if(query == null)

				query = "select * from addressBook order by id";

			

			rs = stat.executeQuery(query);

			// rs�ȿ� �����Ͱ� ���� üũ �� �۾�

			outer.clear();

			while (rs.next()) {

				msg = new Vector<String>();



				msg.add(rs.getString(1));

				msg.add(rs.getString(2));

				msg.add(rs.getString(3));

				msg.add(rs.getString(4));

				msg.add(rs.getString(5));

				outer.add(msg);

			}





		}catch(Exception e){}

	}



	

	

	public void actionPerformed(ActionEvent w){

		Object o = w.getSource();		



		try{

			if(o==add){ //�߰�

				if(fid.getText().length() > 0)

					add();

					select(null);



			}else if(o==delete){ //����

				if(fid.getText().length() > 0)

					delete();

					select(null);



			}else if(o==clear){ //�����

				clear();	



			}else if(o==all){ //��ü����

				select(null);



			}else if(o==update){ //����

				if(fid.getText().length() > 0)

					update();

				select(null);



			}else if(o==search || o == sbutton){ //�˻�:��ư�� �����ų� ���͸� ġ�ų�

				search();			



			}

			

			//model�� �� ����

			

			

			if (outer.isEmpty()) {

				outer.clear();

				

				msg.clear();



				msg.add("ã�� �����Ͱ� �����ϴ�...");

				outer.add(msg);

				model.setDataVector(outer, noresult);

			}else{

				model.setDataVector(outer, title);

			}

			

			//�ʱ�ȭ

			clear();

			

		}catch(Exception ew){

			ew.printStackTrace();

		}

	}



	public static void main(String[] args)	{

		Member_management f = new Member_management();

		f.pack();

		f.setVisible(true);				

	}

	

}
