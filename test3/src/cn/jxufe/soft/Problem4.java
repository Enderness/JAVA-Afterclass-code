package cn.jxufe.soft;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class  Problem4{
    public static void main(String[] args) {
        int num = 4;
        Hero[] heroes = new Hero[num];

        // 实例化N个英雄，你可以根据需要指定英雄的类型
        for (int i = 0; i < num; i++) {
            // 传入1表示普通英雄，传入2表示王者英雄
            int heroType = (i % 2 == 0) ? 1 : 2;
            heroes[i] = new Hero(heroType);
            heroes[i].Info();
        }

        Random random = new Random();
        ArrayList<Hero> winheroes = new ArrayList<>();
        for (Hero hero : heroes) {
            winheroes.add(hero);
        }

        // 模拟决斗
        while (winheroes.size() > 1) {
            int heroIndex1 = random.nextInt(winheroes.size());
            int heroIndex2 = random.nextInt(winheroes.size());

            // 确保不会选择相同的英雄
            while (heroIndex1 == heroIndex2) {
                heroIndex2 = random.nextInt(winheroes.size());
            }

            Hero hero1 = winheroes.get(heroIndex1);
            Hero hero2 = winheroes.get(heroIndex2);


            System.out.println(hero1.name + " vs " + hero2.name);
            hero1.attack(hero2);

            // 判断胜负
            if (hero1.hp <= 0) {
                System.out.println(hero1.name + " 被击败，不再参与决斗。");
                winheroes.remove(hero1);
            } else if (hero2.hp <= 0) {
                System.out.println(hero2.name + " 被击败，不再参与决斗。");
                winheroes.remove(hero2);
            }
        }

        if (winheroes.size() > 0) {
            System.out.println("游戏结束，胜利者是：" + winheroes.get(0).name);
        } else {
            System.out.println("所有英雄都被击败，无胜利者。");
        }
    }
}

class Hero {
    String name;
    int hp;
    String type;
    int level;
    int power;

    public Hero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入英雄的名字: ");
        this.name = scanner.nextLine();
        this.hp = 100;
        this.level = 1;
        this.type = "普通英雄";
        this.power = (int) (Math.random() * 10000);
    }

    public Hero(int type) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入英雄的名字: ");
        this.name = scanner.nextLine();
        if (type == 1) {
            this.hp = 100;
            this.type = "普通英雄";
        } else if (type == 2) {
            this.hp = 200;
            this.type = "王者英雄";
        }
        this.level = 1;
        this.power = (int) (Math.random() * 10000);
    }



    // 攻击方法
    public void attack(Hero opponent) {
        if (opponent.power < this.power) {
            int damage = (int) ((this.power - opponent.power) * 0.1);
            opponent.hp -= damage;
        } else {
            int damage = (int) ((opponent.power - this.power) * 0.1);
            this.hp -= damage;
        }
        if (opponent.hp <= 0) {
            opponent.hp = 0;
            this.level++;
        } else if (this.hp <= 0) {
            this.hp = 0;
            opponent.level++;
        }
    }


    public void Info(){
        System.out.println("英雄名字：" + name);
        System.out.println("生命值：" + hp);
        System.out.println("类型：" + type);
        System.out.println("等级：" + level);
        System.out.println("战斗力：" + power);
        System.out.println("--------------------------");
    }



}