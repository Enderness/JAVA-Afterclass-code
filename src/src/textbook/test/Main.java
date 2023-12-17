package textbook.test;

import java.util.ArrayList;
import java.util.Scanner;

// 联系人类
class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "姓名：" + name + "，电话号码：" + phoneNumber;
    }
}

// 通讯录类
class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    // 添加联系人
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // 删除联系人
    public void deleteContact(String name) {
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    // 显示所有联系人
    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    // 按姓名查找联系人
    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    // 按电话号码查找联系人
    public Contact findContactByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }
}

// 主程序入口
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("\n1. 添加联系人");
            System.out.println("2. 删除联系人");
            System.out.println("3. 显示所有联系人");
            System.out.println("4. 按姓名查找联系人");
            System.out.println("5. 按电话号码查找联系人");
            System.out.println("6. 退出");
            System.out.print("请输入你的选择：");

            int choice = scanner.nextInt();
            scanner.nextLine();  // 消耗换行符

            switch (choice) {
                case 1:
                    System.out.print("请输入姓名：");
                    String name = scanner.nextLine();
                    System.out.print("请输入电话号码：");
                    String phoneNumber = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber);
                    addressBook.addContact(newContact);
                    System.out.println("联系人添加成功！");
                    break;
                case 2:
                    System.out.print("请输入要删除的联系人姓名：");
                    String nameToDelete = scanner.nextLine();
                    addressBook.deleteContact(nameToDelete);
                    System.out.println("联系人删除成功！");
                    break;
                case 3:
                    System.out.println("通讯录中的联系人：");
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.print("请输入要查找的联系人姓名：");
                    String nameToFind = scanner.nextLine();
                    Contact foundContactByName = addressBook.findContactByName(nameToFind);
                    if (foundContactByName != null) {
                        System.out.println("找到联系人：" + foundContactByName);
                    } else {
                        System.out.println("未找到联系人。");
                    }
                    break;
                case 5:
                    System.out.print("请输入要查找的联系人电话号码：");
                    String phoneNumberToFind = scanner.nextLine();
                    Contact foundContactByPhoneNumber = addressBook.findContactByPhoneNumber(phoneNumberToFind);
                    if (foundContactByPhoneNumber != null) {
                        System.out.println("找到联系人：" + foundContactByPhoneNumber);
                    } else {
                        System.out.println("未找到联系人。");
                    }
                    break;
                case 6:
                    System.out.println("程序退出。再见！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("无效选择。请输入1到6之间的数字。");
            }
        }
    }
}
