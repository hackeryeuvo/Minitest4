package Minitest4;

import java.util.Scanner;

public class Main {
    public void menu() {
        CategoryManager categoryManager = new CategoryManager();
        ProductManager productManager = new ProductManager();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("MỜI BẠN LỰA CHỌN");
            System.out.println("1.Hiển thị danh sách các loại sản phẩm");
            System.out.println("2.Thêm 1 loại sản phẩm");
            System.out.println("3.Xóa thông tin loại sản phẩm theo id");
            System.out.println("4. Sửa thông tin sản phẩm theo id ");
            System.out.println("-----------------------------------");
            System.out.println("5.Hiển thị danh sách sản phẩm nói chung ");
            System.out.println("6.Thêm 1 sản phẩm nói chung ");
            System.out.println("7.Xóa 1 sản phẩm nói chung theo id");
            System.out.println("8.Hiển thị danh sách có loại sản phẩm là candy");
            System.out.println("9.Hiển thị danh sách có loại sản phẩm là drinks");
            System.out.println("10.Hiển thị danh sách sản phẩm có giá cao nhất");
            System.out.println("11.Hiển thị danh sách sản phẩm có giá thấp nhất");
            System.out.println("12.Hiển thị danh sách có số lượng sản phẩm cao nhất và ít nhất ");
            System.out.println("13.Hiển thị danh sách sản phẩm là Drinks theo loại chai đựng ");
            System.out.println("14.Hiển thị danh sách sản phẩm là Candy có cân nặng lớn nhất");
            System.out.println("15.Hiển thị danh sách sản phẩm theo loại sản phẩm");
            System.out.println("16.Sửa thông tin sản phẩm theo id");
            System.out.println("17.Tìm kiếm sản phẩm theo tên gần đúng");
            System.out.println("18.Tìm kiếm sản phẩm theo khoảng giá");
            System.out.println("19.Hiển thị sản phẩm là Drinks có loại chai đựng là thủy tinh và có giá lớn nhất ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    categoryManager.disPlaylist();
                    break;
                case 2:
                    categoryManager.addCategory(scanner);
                    break;
                case 3:
                    int id = -1;
                    do {
                        try {
                            System.out.println("nhập id Catagory bạn muốn chọn để dùng xóa sản phẩm");
                            id = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println(" NHẬP LẠI ");
                        }

                    } while (true);
                    productManager.deletedProductByCaTaGoRyId(id);
                    categoryManager.deLeTedById(id);
                    break;
                case 4:
                    categoryManager.changeById(scanner);
                case 5:
                    productManager.displaylist1();
                    break;
                case 6:
                    productManager.createProDuctAndAdd(scanner);
                case 8:
                    productManager.displayCandy();
                    break;
                case 9:
                    productManager.displayDrinks();
                    break;
                case 10:
                    productManager.highestprice();
                    break;
                case 11:
                    productManager.lowestPrice();
                    break;
                case 12:
                    productManager.highestAndLowestQuantity();
                    break;
                case 13:
                    productManager.displayByBottleType(scanner);
                    break;
                case 14:
                    productManager.disPlayHighestWeightCandy();
                    break;
                case 15:
                    productManager.disPlayByType();
                    break;
                case 16:
                    productManager.fixById(scanner);
                    break;
                case 17:
                    productManager.findProductByCloseName(scanner);
                    break;
                case 18:
                    productManager.findProductByPriceRange(scanner);
                    break;
                case 19:
                    productManager.disPlayDrinksBottleMax();

            }
        } while (choice != 0);
    }
}
