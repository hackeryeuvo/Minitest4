package Minitest4;

import minitest2.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    static CategoryManager categoryManager = new CategoryManager();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> list1 = new ArrayList<>();

    public ProductManager() {
        list1.add(new Candy(1, "kẹo mut", 5000, 100, categoryManager.list.get(0), 1));
        list1.add(new Candy(2, "kẹo dẻo", 10000, 50, categoryManager.list.get(0), 2));
        list1.add(new Drinks(3, "Bia", 30000, 70, categoryManager.list.get(1), 1, "Chai nhựa"));
        list1.add(new Drinks(4, "Coca", 25000, 35, categoryManager.list.get(1), 3, "chai thủy tinh"));
    }

    public void displaylist1() { //hiển thị danh sách sản phẩm nói chung
        for (Product p : list1) {
            System.out.println(p);
        }
    }

    public void createProDuctAndAdd(Scanner scanner) { //thêm 1 sản phẩm nói chung
        boolean check1 = true;
        boolean check2 = true;
        boolean check3 = true;
        boolean check4 = true;
        int index = 0;
        int choice;
        for (Product p : list1) {
            if (p != null) {
                index++;
            }
        }
        do {
            System.out.println("nhập loại sản phẩm mà bạn muốn thêm mới ");
            System.out.println("1.Thêm kẹo");
            System.out.println("2.Thêm nước uống");
            System.out.println("0.Hủy thêm vào danh sách ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String name = null;
                    int price = 0;
                    int quantity = 0;
                    int index1 = 0;
                    int weight = 0;
                    System.out.println("Mời bạn nhập tên sản phẩm muốn thêm ");
                    name = scanner.nextLine();
                    while (check1) {
                        try {
                            System.out.println("mời bạn nhập giá sản phẩm muốn thêm ");
                            price = Integer.parseInt(scanner.nextLine());
                            check1 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("mời bạn nhập lại");
                        }

                    }
                    while (check2) {
                        try {
                            System.out.println("mời bạn nhập số lượng sản phẩm muốn thêm ");
                            quantity = Integer.parseInt(scanner.nextLine());
                            check2 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("mời bạn nhập lại");
                        }

                    }
                    while (check3) {
                        try {
                            System.out.println("mời bạn nhập id danh mục sản phẩm muốn gán vào ");
                            index1 = Integer.parseInt(scanner.nextLine());
                            check3 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("mời bạn nhập lại");

                        }
                    }
                    while (check4) {
                        try {
                            System.out.println("Mời bạn nhập khối lượng kẹo ");
                            weight = Integer.parseInt(scanner.nextLine());
                            check4 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("mời bạn nhập lại");
                        }
                    }
                    list1.add(new Candy());
                    list1.set(index, new Candy(index+1 , name, price, quantity, categoryManager.list.get(index1), weight));
                    break;
                case 2:
                    String name1 = null;
                    int price1 = 0;
                    int quantity1 = 0;
                    int index2 = 0;
                    int volume = 0;
                    String bottleType = null;
                    System.out.println("Mời bạn nhập tên sản phẩm muốn thêm ");
                    name1 = scanner.nextLine();
                    while (check1) {
                        try {
                            System.out.println("mời bạn nhập giá sản phẩm muốn thêm ");
                            price1 = Integer.parseInt(scanner.nextLine());
                            check1 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("mời bạn nhập lại");
                        }

                    }
                    while (check2) {
                        try {
                            System.out.println("mời bạn nhập số lượng sản phẩm muốn thêm ");
                            quantity1 = Integer.parseInt(scanner.nextLine());
                            check2 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("mời bạn nhập lại");
                        }

                    }
                    while (check3) {
                        try {
                            System.out.println("mời bạn nhập id danh mục sản phẩm muốn gán vào ");
                            index2 = Integer.parseInt(scanner.nextLine());
                            check3 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("mời bạn nhập lại");

                        }

                    }
                    while (check4) {
                        try {
                            System.out.println("mời bạn nhập thể tích sản phẩm muốn thêm vào");
                            volume = Integer.parseInt(scanner.nextLine());
                            check4 = false;

                        } catch (NumberFormatException e) {
                            System.out.println("mời bạn nhập lại ");

                        }
                    }
                    System.out.println("mời bạn nhập loại chai đựng của sản phẩm ");
                    bottleType = scanner.nextLine();
                    list1.add(new Drinks());
                    list1.set(index, new Drinks(index+1 , name1, price1, quantity1, categoryManager.list.get(index2), volume, bottleType));
                    break;
            }
        } while (choice != 0);

    }

    public void deleTedById(Scanner scanner) { //xóa 1 sản phẩm nói chung theo id
        boolean check = true;
        int id = 0;
        int choice = 0;
        do {
            System.out.println("mời bạn nhập lựa chọn");
            System.out.println("1.xóa sản phẩm");
            System.out.println("2.Thoát ra khỏi chương trình");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    while (check) {
                        try {
                            System.out.println("mời bạn nhập id của sản phẩm kẹo mà bạn muốn xóa ");
                            id = Integer.parseInt(scanner.nextLine());
                            check = false;
                        } catch (NumberFormatException e) {
                            System.out.println("Không có sản phẩm bạn muốn xóa hoặc bạn đã nhập sai Id ");
                        }

                    }
                    Product candy = null;
                    boolean flag = true;
                    for (Product p : list1) {
                        if (id == p.getId()) {
                            candy = p;
                            flag = true;
                            break;
                        } else {
                            flag = false;
                        }
                    }
                    if (flag) {
                        list1.remove(candy);
                    } else {
                        System.out.println("không tìm thấy sản phẩm cần xóa");
                    }
                    break;
                case 2:
                    System.out.println("bạn đã thoát ra khỏi hệ thống ");
                    break;

            }

        } while (choice != 2);
    }

    public void displayCandy() { // hiển thị sản phẩm có danh mục là candy
        for (Product p : list1) {
            if (p instanceof Candy) {
                System.out.println(p);

            }
        }
    }

    public void displayDrinks() {
        for (Product p : list1) {
            if (p instanceof Drinks) {
                System.out.println(p);

            }
        }
    }

    public double highestprice() {
        double max = 0;
        for (Product p : list1) {
            if (p.getPrice() > max) {
                max = p.getPrice();

            }
        }
        System.out.println("Sản phẩm có giá cao nhất là :" + max);
        return max;
    }

    public void lowestPrice() {
        double min = list1.get(0).getPrice();
        for (Product p : list1) {
            if (p.getPrice() < min) {
                min = p.getPrice();
            }
        }
        System.out.println("sản phẩm có giá thấp nhất là :" + min);
    }

    public void highestAndLowestQuantity() {
        double max = 0;
        for (Product p : list1) {
            if (p.getQuantity() > max) {
                max = p.getQuantity();
            }
        }
        System.out.println("sản phẩm có số lượng cao nhất là" + max);
        double min = list1.get(0).getQuantity();
        for (Product p : list1) {
            if (p.getQuantity() < min) {
                min = p.getQuantity();
            }
        }
        System.out.println("sản phẩm có số lượng thấp nhất là " + min);
    }

    public void displayByBottleType(Scanner scanner) {
        String bottleType;
        System.out.println("nhập loại chai thuộc sản phẩm mà bạn cần tìm ");
        bottleType = scanner.nextLine();
        for (Product p : list1) {
            if (p instanceof Drinks) {
                if ((((Drinks) p).getBottleType().toLowerCase()).equals(bottleType.toLowerCase())) {
                    System.out.println("đây là sản nước theo loại chai đựng " + p);
                }
            }
        }
    }

    public void disPlayHighestWeightCandy() {
        double max = 0;
        for (Product p : list1) {
            if (p instanceof Candy) {
                if (((Candy) p).getWeight() > max) {
                    max = ((Candy) p).getWeight();
                }
            }

        }
        System.out.println("Sản phẩm candy có khối lượng lớn nhất là " + max);
    }

    public void disPlayByType() {
        int choice;
        do {
            System.out.println("chọn sản phẩm là muốn hiển thị ");
            System.out.println("1.candy");
            System.out.println("2.drink");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("danh sách candy là :");
                    for (Product p : list1) {
                        if (p instanceof Candy) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 2:
                    System.out.println("danh sách drink là :");
                    for (Product p : list1) {
                        if (p instanceof Drinks) {
                            System.out.println(p);
                        }
                    }
                    break;
            }
        } while (choice != 3);

    }

    public void fixById(Scanner scanner) {
        int id;
        int id1;
        String name;
        int price;
        int quantity = 0;
        int id2;
        String name2;
        int weight;
        int volume;
        String bottleType;
        boolean check = true;

        do {
            try {
                System.out.println("nhập id sản phẩm bạn muốn tìm để sửa");
                id = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập id sản phẩm bạn muốn sửa thành ");
                id1 = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập tên sản phẩm bạn muốn sửa thành ");
                name = scanner.nextLine();
                System.out.println("nhập số lượng sản phẩm bạn muốn sửa thành ");
                price = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập id của loại danh mục sản phẩm bạn muốn sửa thành");
                id2 = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập tên của loại danh mục sản phẩm bạn muốn sửa thành ");
                name2 = scanner.nextLine();
                Category category = null;
                for (Product p : list1) {
                    if (id == p.getId()) {
                        if (p instanceof Candy) {
                            System.out.println("nhập cân nặng cho kẹo ");
                            weight = Integer.parseInt(scanner.nextLine());
                            p.setId(id1);
                            p.setName(name);
                            p.setPrice(price);
//                            p.setCategory(new Category(id2,name2));
                            category = categoryManager.addCategory(scanner);
                            p.setCategory(category);
                            ((Candy) p).setWeight(weight);
                            p.setQuantity(quantity);
                            check = false;

                        } else if (p instanceof Drinks) {
                            System.out.println("nhập thể tích cho chai");
                            volume = Integer.parseInt(scanner.nextLine());
                            bottleType = scanner.nextLine();
                            p.setId(id1);
                            p.setName(name);
                            p.setPrice(price);
                            p.setQuantity(quantity);
                            //               p.setCategory(new Category(id2, name2));
                            category = categoryManager.addCategory(scanner);
                            p.setCategory(category);
                            ((Drinks) p).setVolume(volume);
                            ((Drinks) p).setBottleType(bottleType);
                            check = false;
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("NHẬP LẠI !");
            }


        } while (check);

    }

    public void findProductByCloseName(Scanner scanner) {
        System.out.println("nhập tên sản phẩm bạn muốn tìm");
        String name = scanner.nextLine();
        for (Product p : list1) {
            if (p.getName().contains(name)) {
                System.out.println(p);
            }
        }
    }

    public void findProductByPriceRange(Scanner scanner) {
        System.out.println("nhập khoảng giá của sản phẩm mà bạn muốn tìm :");
        System.out.println("nhập giá bé :");
        int price1 = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giá lớn :");
        int price2 = Integer.parseInt(scanner.nextLine());
        for (Product p : list1) {
            if (price1 < p.getPrice() && price2 > p.getPrice()) {
                System.out.println(p);
            }
        }
    }

    public void disPlayDrinksBottleMax() {
        ProductManager productManager = new ProductManager();
        int A;
        double max = productManager.highestprice();
        String bottleType = "chai thủy tinh";
        for (Product p : list1) {
            if (p instanceof Drinks) {
                if ((((Drinks) p).getBottleType().toLowerCase()).equals(bottleType.toLowerCase())) {
                    if (p.getPrice() == max) {
                        System.out.println(p);
                    }

                }
            }
        }
    }

    public int deletedProductByCaTaGoRyId(int id) {

        for (int i = 0; i < list1.size(); i++) {
            if (id == list1.get(i).getCategory().getId()) {
                list1.remove(i);
                i--;
            }
        }
        ;
        return id;
    }

}
