package nguyenhoanganhkhoa.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Slide60_BaiTapHashMap {
	
	static HashMap<Integer,String> dsSinhVien=new HashMap<Integer, String>();

	public static void main(String[] args) {
		do {
		menu();
		}while(true);
	}

	private static void menu() {
		System.out.println("CÁC CHỨC NĂNG PHẦN MỀM");
		System.out.println("     1. Thêm sinh viên");
		System.out.println("     2. Xuất danh sách sinh viên theo Mã và Tên");
		System.out.println("     3. Sửa sinh viên");
		System.out.println("     4. Xóa sinh viên chứa tên bất kì");
		System.out.println("     5. Tìm sinh viên tên có chữ An");
		System.out.println("     6. Sắp xếp sinh viên");
		System.out.println("     7. Xuất ra các mã sinh viên");
		System.out.println("     8. Xuất ra các tên sinh viên");
		System.out.println("     9. Thoát chương trình");
		System.out.print("Chọn chức năng bạn muốn làm : ");
		int kq = new Scanner(System.in).nextInt();
		switch(kq)
		{
		case 1:
			themSinhVien();
			break;
		case 2:
			xuatDSSV();
			break;
		case 3:
			suaSV();
			break;
		case 4:
			xoaSV();
			break;
		case 5:
			timSVtenAn();
			break;
		case 6:
			sapXepSV();
			break;
		case 7:
			xuatMaSV();
			break;
		case 8:
			xuatTenSV();
			break;
		case 9:
			System.out.println("Bái bai");
			System.exit(0);
			break;
		}
		
	}

	private static void xuatTenSV() {
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập tên SV => Mời nhập");
		else
		{
			System.out.println("Danh sách tên SV là : ");
			for (Map.Entry<Integer, String> item : dsSinhVien.entrySet())
			{
				System.out.println(item.getValue());
			}
		}
	}

	private static void xuatMaSV() {
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập tên SV => Mời nhập");
		else
		{
			System.out.println("DS Mã SV là : ");
			for (Map.Entry<Integer, String> item : dsSinhVien.entrySet())
			{
				System.out.println(item.getKey());
			}
		}
	}
	private static void sapXepSV() {
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập tên SV => Mời nhập");
		else
		{
			System.out.println("Danh sách sinh viên sau khi sắp xếp là : ");
			TreeMap<Integer, String> sorted = new TreeMap<>(dsSinhVien);
		    Set<Map.Entry<Integer, String>> mappings = sorted.entrySet();
			for (Map.Entry<Integer, String> item : mappings)
			{
				System.out.println(item.getKey() + " : " + item.getValue());
			}
		}
		
	}

	private static void timSVtenAn() {
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập tên SV => Mời nhập");
		else
		{ 
			System.out.println("Danh sách sinh viên có tên An là : ");
			for (Map.Entry<Integer, String> svTenAn : dsSinhVien.entrySet())
			{
				if(svTenAn.getValue().contains("An"))
				{
					System.out.println(svTenAn.getKey() + " : " + svTenAn.getValue());
				}
			}
			
		}
		
	}

	private static void xoaSV() {
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập tên SV => Mời nhập");
		else
		{ 
			System.out.print("Mời bạn nhập tên của SV muốn xóa : ");
			String tenSVCanXoa = new Scanner(System.in).nextLine();
			for (Map.Entry<Integer, String> svTenCanXoa : dsSinhVien.entrySet())
			{
				if(svTenCanXoa.getValue().contains(tenSVCanXoa))
				{
					dsSinhVien.remove(svTenCanXoa.getKey());
				}
			}
		}
	}

	private static void suaSV() {
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập tên SV => Mời nhập");
		else
		{ 
			System.out.print("Mời bạn nhập mã của SV muốn sửa : ");
			int maCanSua = new Scanner(System.in).nextInt();
			if(dsSinhVien.containsKey(maCanSua)==false)
				System.out.println("Mã SV không tồn tại");
			else 
			{
				System.out.print("Nhập tên SV mới : ");
				String newSV = new Scanner(System.in).nextLine();
				dsSinhVien.put(maCanSua, newSV);
			}
		}
	}

	private static void xuatDSSV() {
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập tên SV => Mời nhập");
		else
		{
			System.out.println("Danh sách SV : ");
			for (Map.Entry<Integer, String> item : dsSinhVien.entrySet())
			{
				System.out.println(item.getKey() + " : " + item.getValue());
			}
		}
	}

	private static void themSinhVien() {
		System.out.print("Mời bạn nhập Mã SV : ");
		int maSV = new Scanner(System.in).nextInt();
		System.out.print("Mời bạn nhập Tên SV : ");
		String tenSV = new Scanner(System.in).nextLine();
		if (dsSinhVien.containsKey(maSV)==false)
		{
			dsSinhVien.put(maSV,tenSV);
		}
	}
}
