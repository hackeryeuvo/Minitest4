package Minitest4;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Category> list = new ArrayList<>();

    public CategoryManager() {
        list.add(new Category(1, "Candy"));
        list.add(new Category(2, "Drinks"));
    }

    //hiển thị danh sách sản phẩm
    public void disPlaylist() {
        for (Category p : list) {
            System.out.println(p);

        }
    }

    public Category addCategory(Scanner scanner) {
        boolean check = true;
        Category category1 = null;
        System.out.println("Nhập thông tin sản phẩm bạn muốn thêm");
        int id = 0;
        String name = null;
        do {
            try {
                System.out.println("Nhập id sản phẩm muốn thêm");
                id = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("mời bạn nhập lại");
            }
        } while (check);

        do {
            try {
                System.out.println("nhập name sản phẩm muốn thêm ");
                name = scanner.nextLine();
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("mời bạn nhập lại");
            }
        } while (check);


        category1 = new Category(id, name);
        list.add(category1);
        return category1;

    }

    public int deLeTedById(int id) {
        Category category=null;
        for (int i=0;i<list.size();i++){
            if(id == list.get(i).getId()){
                category=list.get(i);
            }
        } return id;
    }

    public void changeById(Scanner scanner) {
        int A = 0;
        int B = 0;
        String C = null;
        boolean check = true;
        boolean check1 = true;
        boolean check2 = true;
        do {
            try {
                System.out.println("nhập Id sản phẩm bạn muốn tìm để sửa");
                A = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai , mời bạn nhập lại");
            }
        } while (check);
        do {
            try {
                System.out.println("nhập Id sản phẩm bạn muốn sửa thành");
                B = Integer.parseInt(scanner.nextLine());
                check1 = false;
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai mời bạn nhập lại");
            }
        } while (check1);
        do {
            try {
                System.out.println("Nhập name bạn muốn sửa thành ");
                C = scanner.nextLine();
                check2 = false;

            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai mời bạn nhập lại");
            }
        } while (check2);
        Category D = null;
        boolean flag = true;
        for (Category p : list) {
            if (A == p.getId()) {
                D = p;
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (flag) {
            D.setId(B);
            D.setName(C);
        } else {
            System.out.println("không tìm thấy sản phẩm cần sửa");
        }
    }


}
