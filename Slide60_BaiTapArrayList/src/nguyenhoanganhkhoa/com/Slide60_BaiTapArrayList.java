package nguyenhoanganhkhoa.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slide60_BaiTapArrayList {
	
	static ArrayList<String> dsSinhVien=new ArrayList<String>();
	
	static void menu()
	{
		System.out.println("CÁC CHỨC NĂNG PHẦN MỀM");
		System.out.println("     1. Thêm sinh viên");
		System.out.println("     2. Xuất danh sách sinh viên");
		System.out.println("     3. Sửa sinh viên");
		System.out.println("     4. Xóa sinh viên chứa tên bất kì");
		System.out.println("     5. Tìm sinh viên tên có chữ An");
		System.out.println("     6. Sắp xếp sinh viên");
		System.out.println("     7. Xuất ra số lượng sinh viên");
		System.out.println("     8. Thoát chương trình");
		System.out.print("Chọn chức năng bạn muốn làm : ");
		int kq = new Scanner(System.in).nextInt();
		switch (kq)
		{
		case 1:
			themSV();
			break;
		case 2:
			xuatSV();
			break;
		case 3:
			suaSV();
			break;
		case 4:
			xoaSVbatKi();
			break;
		case 5:
			timSVAn();
			break;
		case 6:
			sapXepSV();
			break;
		case 7:
			xuatSoLuongSV();
			break;
		case 8: 
			thoatCT();
			break;
		}
		
		
		
		
	}

	private static void thoatCT() {
		System.out.println("Bái bai");
		System.exit(0);
		
	}

	private static void xuatSoLuongSV() {
		System.out.println("Số lượng sinh viên là  : " + dsSinhVien.size());
	}

	private static void sapXepSV() {
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập SV => Mời nhập");
		else
		{
			System.out.println("Danh sách sau khi sắp xếp là : ");
			Collections.sort(dsSinhVien);
			for (int i=0;i<dsSinhVien.size();i++)
			{
				System.out.println((i+1)+". "+dsSinhVien.get(i));
			}
		}
		
		
	}

	private static void timSVAn() {
		int kt=0;
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập SV => Mời nhập");
		else {
			System.out.println("Danh sách người tên An : ");
			for (int i=0;i<dsSinhVien.size();i++)
			{
				if(dsSinhVien.get(i).contains("An"))
				{
					System.out.println((i+1)+". "+dsSinhVien.get(i));;
					kt++;
				}
				if(kt==0)
				{
					System.out.println("Không có an tên An trong danh sách cả");
				}
			}
		
		}
		
		
	}

	private static void xoaSVbatKi() {
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập SV => Mời nhập");
		else {
			System.out.println("Danh sách sinh viên : ");
			for(int i = 0;i<dsSinhVien.size();i++)
			{
				System.out.println((i+1)+". "+ dsSinhVien.get(i));
			}
			System.out.print("Sinh viên bạn muốn xóa ở vị trí thứ : ");
			int vtXoa = new Scanner(System.in).nextInt();
			dsSinhVien.remove(vtXoa-1);
		}
		
	}

	private static void suaSV() {
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập SV => Mời nhập");
		else {
			System.out.println("Danh sách sinh viên : ");
			for(int i = 0;i<dsSinhVien.size();i++)
			{
				System.out.println((i+1)+". "+ dsSinhVien.get(i));
			}
			System.out.print("Sinh viên bạn muốn sửa ở vị trí thứ : ");
			int vtSua = new Scanner(System.in).nextInt();
			System.out.print("Nội dung cần sửa là : ");
			String ndSua = new Scanner(System.in).nextLine();
			dsSinhVien.set(vtSua-1,ndSua);
		}
		
	}

	private static void xuatSV() {
		if (dsSinhVien.size()==0)
			System.out.println("Bạn chưa nhập SV => Mời nhập");
		else {
			System.out.println("Danh sách sinh viên : ");
			for(int i = 0;i<dsSinhVien.size();i++)
			{
				System.out.println((i+1)+". "+dsSinhVien.get(i));
			}
		}
		
	}

	private static void themSV() {
		System.out.print("Mời bạn nhập tên sinh viên cần thêm : ");
		String newSV = new Scanner(System.in).nextLine();
		dsSinhVien.add(newSV);
		
	}

	public static void main(String[] args) {
		do {
		menu();
		}while(true);

	}

}
