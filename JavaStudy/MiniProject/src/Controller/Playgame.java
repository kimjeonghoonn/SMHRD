package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Model.pocketmon_default;
import View.StartMain;

public class Playgame {
   int EXP = 0;
   int lv = 1;
   int hp = 100;
   int MaxHP = 100;

   ArrayList<StartMain> monList = new ArrayList();
   pocketmon_default monP;
   String name;
   String skill1;
   String skill2;
   String skill3;
   String id;

   public Playgame(pocketmon_default monP, String id) {
      this.monP = monP;
      this.id = id;
   }

   // String name, int lv, int HP, int MaxHP, int EXP, String skill1 , String
   // skill2, String skill3
   pocketmon_default mon1 = new pocketmon_default("���α�", 1, 100, 100, 0, "�����ġ��", "level 2�� ����", "level 3�� ����", id);
   pocketmon_default mon2 = new pocketmon_default("��Ϻα�", lv, hp, 200, EXP, "�����ġ��", "������", "level 3�� ����", id);
   pocketmon_default mon3 = new pocketmon_default("�źϿ�", lv, hp, 300, EXP, "�����ġ��", "������", "���̵������", id);

   pocketmon_default mon4 = new pocketmon_default("���̸�", 1, 100, 100, 0, "ȭ�����", "level 2�� ����", "level 3�� ����", id);
   pocketmon_default mon5 = new pocketmon_default("���ڵ�", lv, hp, 200, EXP, "ȭ�����", "�Ҳɾ���", "level 3�� ����", id);
   pocketmon_default mon6 = new pocketmon_default("���ڸ�", lv, hp, 300, EXP, "ȭ�����", "�Ҳɾ���", "�÷������̺�", id);

   pocketmon_default mon7 = new pocketmon_default("�̻��ؾ�", 1, 100, 100, 0, "�����ġ��", "level 2�� ����", "level 3�� ����", id);
   pocketmon_default mon8 = new pocketmon_default("�̻���Ǯ", lv, hp, 200, EXP, "�����ġ��", "����ä��", "level 3�� ����", id);
   pocketmon_default mon9 = new pocketmon_default("�̻��ز�", lv, hp, 300, EXP, "�����ġ��", "����ä��", "�ֶ��", id);

   pocketmon_default mon10 = new pocketmon_default("�ǰ���", 10, 100, 500, 10, "������", ".", ".", id);

   public void Play(ArrayList<StartMain> monList) {

      // �ൿ ���� ������
      System.out.println("���ϸ�� ������ �����մϴ�.");
      Scanner sc = new Scanner(System.in);
      while (true) {
         System.out.println();
         System.out.println("1.[�����ϱ�] 2.[�޽��ϱ�] 3.[���忡�� ����] 4.[�����ϱ�] 5.[���� ����]");
         System.out.print("�Է� >> ");
         int choice = sc.nextInt();

         // �����ϱ� ������
         if (choice == 1) {
            Random rd = new Random();
            int number = rd.nextInt(4);
            // �߻� ���ϸ� ���
            if (number == 0) {
               Random wild1 = new Random();
               int num1 = wild1.nextInt(1);
               if (num1 == 0) {
                  wild1.nextInt();
                  String[] wildP = { "����", "��ī��", "Ǫ��", "��Ÿ��", "�Ŀ���", "�����" };

                  String result1 = wildP[wild1.nextInt(6)];
                  System.out.println("�߻��� " + result1 + "��/�� ��Ÿ����!!");
                  switch (result1) {
                  case "����":
                     Poc_image asd = new Poc_image();
                     asd.KKo();
                     break;
                  case "��ī��":
                     Poc_image asdf = new Poc_image();
                     asdf.Pikka();
                     break;
                  case "Ǫ��":
                     Poc_image as = new Poc_image();
                     as.purin();
                     break;
                  case "��Ÿ��":
                     Poc_image a = new Poc_image();
                     a.meta();
                     break;
                  case "�Ŀ���":
                     Poc_image asdfe = new Poc_image();
                     asdfe.nayoung();
                     break;
                  case "�����":
                     Poc_image asdfe3 = new Poc_image();
                     asdfe3.nauemrum();
                     break;
                  }
                  System.out.println();
                  System.out.println("1.[�����Ѵ�] 2.[��������]");
                  System.out.print("�Է� >> ");
                  Scanner sc1 = new Scanner(System.in);
                  int atk = sc1.nextInt();

                  if (atk == 1) {
                     System.out.println("����! " + monP.name + "! " + monP.skill1 + "!");

                     switch (result1) {
                     case "����":
                        System.out.println("������ ��������..����ġ 13�� ȹ���߽��ϴ�.");
                        EXP = EXP + 13;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| ���� ����ġ : " + EXP);
                        break;
                     case "��ī��":
                        System.out.println("��ī��� ��������..����ġ 12�� ȹ���߽��ϴ�.");
                        EXP = EXP + 12;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| ���� ����ġ : " + EXP);
                        break;
                     case "Ǫ��":
                        System.out.println("Ǫ���� ��������..����ġ 11�� ȹ���߽��ϴ�.");
                        EXP = EXP + 11;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| ���� ����ġ : " + EXP);
                        break;
                     case "��Ÿ��":
                        System.out.println("��Ÿ���� ��������..����ġ 10�� ȹ���߽��ϴ�.");
                        EXP = EXP + 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| ���� ����ġ : " + EXP);
                        break;
                     case "�Ŀ���":
                        System.out.println("�Ŀ��̴� ��������..����ġ 15�� ȹ���߽��ϴ�.");
                        EXP = EXP + 15;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| ���� ����ġ : " + EXP);
                        break;
                     case "�����":
                        System.out.println("����̴� ��������..����ġ 20�� ȹ���߽��ϴ�.");
                        EXP = EXP + 20;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| ���� ����ġ : " + EXP);
                        break;
                     }
                  }
                  if (atk == 2) {
                     System.out.println("������ �����ƴ�!!");
                  }
               }

            }
            // �߻����� ������
            else if (number == 1) {
               Random wild2 = new Random();
               int ran = wild2.nextInt(2);
               String[] wildF = { "������ ����", "�����ѿ���" };
               String result2 = wildF[ran];
               Poc_image asdfe5 = new Poc_image();
               asdfe5.apple();
               System.out.println();
               System.out.println("������ ���Ÿ� �߰��߽��ϴ�.");
               System.out.println("[1] ���Դ´� [2] �����Ѵ�");
               System.out.print("�Է�>> ");
               Scanner sc1 = new Scanner(System.in);
               int num = sc1.nextInt();
               if (num == 1) {
                  switch (result2) {
                  case "������ ����":
                     System.out.println("���־� ���δ�! �ȳ� ����...���ִ°�?? ������ ���� ��� ����ġ 10�� ȹ���߽��ϴ�!");
                     EXP = EXP + 10;
                     levelup();
                     System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     break;
                  case "�����ѿ���":
                     System.out.println("���־� ���δ�! �ȳ� ����...����.�̤�...�ʹ� ���� ��� ����ġ 10�� �Ҿ����ϴ�..");
                     EXP = EXP - 10;
                     levelup();
                     System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     break;
                  }
               } else if (num == 2) {
                  System.out.println("������ �ƹ��ų� �ֿ����� ����� �ϼ���..");
                  System.out.println("������ ���Ÿ� �����ϰ� �����մϴ�..");

               } else {
                  System.out.println("�߸��� �Է��Դϴ�.");

               }

            }
            // NPC ������
            else if (number == 2) {
               Random rannpc = new Random();
               int ran3 = rannpc.nextInt(3);
               String[] npc = { "����", "�̽���", "����" };
               String result3 = npc[ran3];
               System.out.println("���� ���� "+result3 + "�� �������ϴ�.");
               System.out.println();
               System.out.println("[1]��ȭ�Ѵ� [2]�����Ѵ�");
               System.out.print("�Է�>> ");
               Scanner sc3 = new Scanner(System.in);
               int num3 = sc3.nextInt();
               if (num3 == 1) {
                  switch (result3) {
                  case "����":
                     Poc_image asdfe56 = new Poc_image();
                     asdfe56.jiwo();
                     System.out.print(result3 + "�� �������ϴ�.");
                     System.out.println("���� : �� ���� ������...");
                     System.out.println("[1]���� �达 [2]���� �̾� [3]û�� �Ѿ� [4]���� �־� [5]�˰� ���� ����");
                     Scanner sc31 = new Scanner(System.in);
                     int num31 = sc31.nextInt();
                     if (num31 == 1) {
                        System.out.println("���� : �ƳĤ̤�");
                        System.out.println("����ġ 10�� �Ҿ����ϴ�.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num31 == 2) {
                        System.out.println("���� : �ƴϾߤ̤�");
                        System.out.println("����ġ 10�� �Ҿ����ϴ�.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num31 == 3) {
                        System.out.println("���� : ������...///");
                        System.out.println("����ġ 10�� ������ϴ�.");
                        EXP = EXP + 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num31 == 4) {
                        System.out.println("���� : ��;��;");
                        System.out.println("����ġ 10�� �Ҿ����ϴ�.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num31 == 5) {
                        System.out.println("���� : ��");
                        System.out.println("����ġ 10�� �Ҿ����ϴ�.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else {
                        System.out.println("�߸��� �Է��Դϴ�.");
                     }
                     break;

                  case "�̽���":
                     Poc_image asdfe562 = new Poc_image();
                     asdfe562.eeseul();
                     System.out.println();
                     System.out.print("���� ���� " + result3 + "�� �������ϴ�.");
                     System.out.println("�̽��� : �ȴ�...�� ���� ���纸�ھ�?");
                     System.out.println("[1]�о� �ھ� [2]���� �־� [3]���� ���� [4]��� �ž� [5]�˰Թ��� ����");
                     System.out.print("�Է�>> ");
                     Scanner sc32 = new Scanner(System.in);
                     int num32 = sc32.nextInt();
                     if (num32 == 1) {
                        System.out.println("�̽��� : �ƴϾ�");
                        System.out.println("����ġ 10�� �Ҿ����ϴ�.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num32 == 2) {
                        System.out.println("�̽��� : �¾Ҿ�!");
                        System.out.println("����ġ 20�� ������ϴ�.");
                        EXP = EXP + 20;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num32 == 3) {
                        System.out.println("�̽��� : �Ƴ�");
                        System.out.println("����ġ 10�� �Ҿ����ϴ�.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num32 == 4) {
                        System.out.println("�̽��� : Ʋ�Ⱦ�");
                        System.out.println("����ġ 10�� �Ҿ����ϴ�.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num32 == 5) {
                        System.out.println("�̽��� : ...");
                        System.out.println("����ġ 10�� �Ҿ����ϴ�.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else {
                        System.out.println("�߸��� �Է��Դϴ�.");
                     }
                     break;

                  case "����":
                     Poc_image asdffgh = new Poc_image();
                     asdffgh.woong();
                     System.out.println();
                     System.out.print("���� ����" + result3 + "�� �������ϴ�.");
                     System.out.println("���� : �� ���� ������");
                     System.out.println("[1]���� ���� [2]â�� ���� [3]���� �Ӿ� [4]�� ä�� [5]�˰� ���� ����");
                     System.out.print("�Է�>> ");
                     Scanner sc33 = new Scanner(System.in);
                     int num33 = sc33.nextInt();
                     if (num33 == 1) {
                        System.out.println("���� : ...");
                        System.out.println("����ġ 1�� �Ҿ����ϴ�.");
                        EXP = EXP - 1;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num33 == 2) {
                        System.out.println("���� : ...");
                        System.out.println("����ġ 1�� �Ҿ����ϴ�.");
                        EXP = EXP - 1;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num33 == 3) {
                        System.out.println("���� : ...");
                        System.out.println("����ġ 1�� �Ҿ����ϴ�.");
                        EXP = EXP - 1;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num33 == 4) {
                        System.out.println("���� : ...");
                        System.out.println("����ġ 1�� �Ҿ����ϴ�.");
                        EXP = EXP - 1;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                     } else if (num33 == 5) {
                        System.out.println("���� : ��..");
                        System.out.println("����ġ 1�� �Ҿ����ϴ�.");
                        EXP = EXP - 1;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| ���� ����ġ : " + EXP);
                        break;

                     } else if (num3 == 2) {
                        System.out.println("�����ϰ� �����մϴ�.");

                     } else {
                        System.out.println("�߸��� �Է��Դϴ�.");

                     }
                  }
               }
            }
            // ���̹� ��Ʋ ������
            else if (number == 3) {
               int hp10 = 100;
               Poc_image baram = new Poc_image();
               baram.baram();
               System.out.println("�濡�� �쿬�� ���̹� �ٶ��� ������!!");
               System.out.println();
               System.out.println("[1]����Ѵ� [2]�����Ѵ�");
               System.out.print("�Է�>> ");
               Scanner sc44 = new Scanner(System.in);
               int num44 = sc44.nextInt();
               if (num44 == 1) {
                  Poc_image gas = new Poc_image();
                  gas.gas();
                  while (true) {
                     System.out.println();
                     System.out.println("1. " + monP.skill1 + " 2. " + monP.skill2 + " 3. " + monP.skill3);
                     System.out.print("�Է�>> ");
                     Scanner sc45 = new Scanner(System.in);
                     int num45 = sc45.nextInt();
                     if (num45 == 1) {
                        System.out.println(monP.skill1 + "!!");
                        System.out.println(monP.name + " ��(��) �ǰ������� 20�� ���ظ� �������ϴ�");
                        System.out.println("������!!");
                        System.out.println("�ǰ����� �ݰ��� �մϴ�. " + monP.name + " ��(��) 21�� ���ظ� �޽��ϴ�");
                        hp -= 21;
                        hp10 -= 20;
                        if (hp10 <= 0) {
                           System.out.println("�ǰ����� hp : 0");
                           if (hp <= 0) {
                              System.out.println(monP.name + "�� hp : 0");
                              System.out.println("���ºδ�!");
                              System.out.println();
                              break;
                           } else if (hp10 < hp) {
                              System.out.println(monP.name + "�� hp : " + hp);
                              System.out.println("����~");
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println("�ǰ����� hp : " + hp10);
                        }
                        if (hp <= 0) {
                           System.out.println(monP.name + "�� hp : 0");
                           if (hp10 > hp) {
                              System.out.println("����߾�! ������ �ٽ� �پ�");
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println(monP.name + "�� hp : " + hp);
                        }

                     } else if (num45 == 2) {
                        System.out.println(monP.skill2 + "!!");
                        System.out.println(monP.name + " ��(��) �ǰ������� 30�� ���ظ� �������ϴ�");
                        System.out.println("������!!");
                        System.out.println("�ǰ����� �ݰ��� �մϴ�. " + monP.name + " ��(��) 21�� ���ظ� �޽��ϴ�");
                        hp -= 21;
                        hp10 -= 30;
                        if (hp10 <= 0) {
                           System.out.println("�ǰ����� hp : 0");
                           if (hp <= 0) {
                              System.out.println(monP.name + "�� hp : 0");
                              System.out.println("���ºδ�!");
                              System.out.println();
                              break;
                           } else if (hp10 < hp) {
                              System.out.println(monP.name + "�� hp : " + hp);
                              System.out.println("����~");
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println("�ǰ����� hp : " + hp10);
                        }
                        if (hp <= 0) {
                           System.out.println(monP.name + "�� hp : 0");
                           if (hp10 > hp) {
                              System.out.println("����߾�! ������ �ٽ� �پ�");
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println(monP.name + "�� hp : " + hp);
                        }

                     } else if (num45 == 3) {
                        System.out.println(monP.skill3 + "!!");
                        System.out.println(monP.name + " ��(��) �ǰ������� 40�� ���ظ� �������ϴ�");
                        System.out.println("������!!");
                        System.out.println("�ǰ����� �ݰ��� �մϴ�. " + monP.name + " ��(��) 21�� ���ظ� �޽��ϴ�");
                        hp -= 21;
                        hp10 -= 40;
                        if (hp10 <= 0) {
                           System.out.println("�ǰ����� hp : 0");
                           if (hp <= 0) {
                              System.out.println(monP.name + "�� hp : 0");
                              System.out.println("���ºδ�!");
                              System.out.println();
                              break;
                           } else if (hp10 < hp) {
                              System.out.println(monP.name + "�� hp : " + hp);
                              System.out.println("�ٶ��̿��� ���ϸ� ��ῡ�� �¸��ߴ�!!");
                              System.out.println("����~");
                              EXP = EXP+25;
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println("�ǰ����� hp : " + hp10);
                        }
                        if (hp <= 0) {
                           System.out.println(monP.name + "�� hp : 0");
                           if (hp10 > hp) {
                              System.out.println("����߾�! ������ �ٽ� �پ�");
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println(monP.name + "�� hp : " + hp);
                        }
                        //////////////
                     }
                  }
               } else if (num44 == 2) {
                  System.out.println("�ʶ� �ο�� ���� �ð� ����! ����");
                  System.out.println("�ٶ� : ������ �༮ �� �������°ų�?");
                  System.out.println("�ٶ��̸� �����ϰ� �������ϴ�.");

               }

            }

         }
         // �޽� ������
         if (choice == 2) {
            System.out.println("1.[���ϸ� ���� ����] 2.[���ϸ�� �� �Ա�] 3.[�� ���ϸ� ����Ȯ��]");
            System.out.print("�Է� >> ");
            int select2 = sc.nextInt();
            if (select2 == 1) {
               Poc_image lucky = new Poc_image();
                lucky.lucky();
               System.out.println("���ϸ� ���ͷ� ����~~");
               hp=monP.getMaxHP();
//               hp = (monP.getHP()-hp)+hp;

                  
               
               System.out.println("ü���� ��� ȸ���Ǿ���!");
            } else if (select2 == 2) {
               Poc_image eat = new Poc_image();
                eat.eat();
               System.out.println("���ϸ�� �� �Ա�~");
               hp = hp + 10;
               EXP = EXP + 10;
               levelup();
               System.out.println("���ϸ��� ü�°� ����ġ�� ���� �ö���!");
            } else if (select2 == 3) {
               System.out.println(monP.name + "�� ����");
               levelup();
               System.out.println("Level : " + lv);
               System.out.println("HP : " + hp);
               System.out.println("MaxHP : "+monP.getMaxHP());
               System.out.println("EXP : " + EXP);
               System.out.println("���� ��ų1 : " + monP.skill1);
               System.out.println("���� ��ų2 : " + monP.skill2);
               System.out.println("���� ��ų3 : " + monP.skill3);

            }

         }
         // ���忡�� ���� ������
         else if (choice == 3) {
            int boss = 300;
            if (lv < 3) {
               Poc_image boss1 = new Poc_image();
                boss1.boss();
               System.out.println("������ �����ϱ⿡�� �ʹ� �̸��� ����..");
               System.out.println("�� ������ �ϰ� ���Ŷ�!");
            } else if (lv == 3) {
               Poc_image dos = new Poc_image();
                dos.dos();
               System.out.println("������ ���ʹٰ�?");
               System.out.println("���� �پ�Ѿ����!");
               while (hp > 0 && boss > 0) {
                  Random skillran = new Random();
                  int ran4 = skillran.nextInt(4);
                  String[] skill4 = { "��������", "��������", "�ٴ�ȸ����", "���̵������" };
                  String result4 = skill4[ran4];

                  System.out.println();
                  System.out.println("[1]" + monP.skill1 + " [2]" + monP.skill2 + " [3]" + monP.skill3);
                  System.out.print("�Է�>> ");
                  Scanner sc4 = new Scanner(System.in);
                  int num4 = sc4.nextInt();
                  if (num4 == 1) {
                     Random randam = new Random();
                     int ran5 = randam.nextInt(2);
                     int[] dam = { 0, 10 };
                     int result5 = dam[ran5];

                     System.out.print("���󵵽� " + result4 + "�� ");
                     System.out.println(monP.skill1 + "�� �¼����ϴ�.");
                     hp -= (ran4 * 10);
                     boss -= result5;
                     System.out.println("������ " + result5 + "�� �������ϴ�.");
                     System.out.println("������ " + (ran4 * 10) + "�� �Ծ����ϴ�.");
                     System.out.println();

                     if (boss <= 0) {
                        System.out.println("���󵵽��� hp : 0");
                     } else {
                        System.out.println("���󵵽��� hp : " + boss);
                     }
                     if (hp <= 0) {
                        System.out.println(monP.name + "�� hp : 0");
                     } else {
                        System.out.println(monP.name + "�� hp : " + hp);
                     }

                  } else if (num4 == 2) {
                     Random randam = new Random();
                     int ran5 = randam.nextInt(4);
                     int[] dam = { 0, 20, 20, 40 };
                     int result5 = dam[ran5];

                     System.out.print("���󵵽��� " + result4 + "�� ");
                     System.out.println(monP.skill2 + "�� �¼����ϴ�.");
                     hp -= (ran4 * 10);
                     boss -= result5;
                     System.out.println("������ " + result5 + "�� �������ϴ�.");
                     System.out.println("������ " + (ran4 * 10) + "�� �Ծ����ϴ�.");
                     System.out.println();

                     if (boss <= 0) {
                        System.out.println("���󵵽��� hp : 0");
                     } else {
                        System.out.println("���󵵽��� hp : " + boss);
                     }
                     if (hp <= 0) {
                        System.out.println(monP.name + "�� hp : 0");
                     } else {
                        System.out.println(monP.name + "�� hp : " + hp);
                     }
                  } else if (num4 == 3) {
                     Random randam = new Random();
                     int ran5 = randam.nextInt(3);
                     int[] dam = { 0, 40, 80 };
                     int result5 = dam[ran5];

                     System.out.print("����� " + result4 + "�� ");
                     System.out.println(monP.skill3 + "�� �¼����ϴ�.");
                     hp -= ((ran4 * 10) + 10);
                     boss -= result5;
                     System.out.println("������" + result5 + "�� �������ϴ�.");
                     System.out.println("������" + ((ran4 * 10) + 10) + "�� �Ծ����ϴ�.");
                     System.out.println();

                     if (boss <= 0) {
                        System.out.println("���󵵽��� hp : 0");
                     } else {
                        System.out.println("���󵵽��� hp : " + boss);
                     }
                     if (hp <= 0) {
                        System.out.println(monP.name + "�� hp : 0");
                     } else {
                        System.out.println(monP.name + "�� hp : " + hp);
                     }

                  } else {
                     System.out.println("�߸��� �Է��Դϴ�.");
                  }
               }
            }
            if (boss <= 0) {
               if (boss < hp) {
                 Poc_image asdlkl = new Poc_image();
                  asdlkl.badge();
                  System.out.println("��" + monP.name + "�� �¸���");
                  System.out.println("���� �ºο���. �� ����");
                  System.out.println("�ڡڡڡڿ�������Ƽ ������ ȹ���ߴ١ڡڡڡ�");
                  
               } else if (boss == hp) {
                  System.out.println("���º�");
                  System.out.println("�ٽ� ���� ����!");
               }
            } else if (hp <= 0) {
               if (boss > hp) {
                  System.out.println("===" + monP.name + "�� �й�===");
                  System.out.println("���� �����ϱ���, �������� ���ƿͶ�");
               } else if (boss == hp) {
                  System.out.println("���º�");
                  System.out.println("�ٽ� ���� ����!");
               }
            }
         }
         //�����ϱ�
         else if (choice == 4) {
            SaveLoad sv = new SaveLoad();
            sv.Save(hp, monP.name, EXP, lv, monP.skill1, monP.skill2, monP.skill3, id, MaxHP);
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
         }
         // �����ϱ�
         else if (choice == 5) {
            System.out.println("�α׾ƿ� �Ͻðڽ��ϱ�? [1]�� [2]�ƴϿ�");
            Scanner sc66 = new Scanner(System.in);

            int restart = sc66.nextInt();

            if (restart == 1) {
               // ���� ����
               System.out.println("������ �����մϴ�..");
               break;
            } // �����
            else if (restart == 2) {
               System.out.println("\n==���� ȭ������ ���ư��ϴ�==\n");
            }
         }
      }
   }

   void levelup() {
         
        if (EXP >= 30) {
           lv++;
           EXP = EXP - 30;
           System.out.println("�� ���ϸ��� ���°�?!!!");
           
           if (lv == 2 && mon1.name.equals(monP.getName())) {
                monP = mon2;
                System.out.println("��"+monP.name+"���� ��ȭ�Ͽ���!"+"��");
             }
           if(lv == 2 &&mon4.name.equals(monP.getName())) {
                monP = mon5;
                System.out.println("��"+monP.name+"���� ��ȭ�Ͽ���!"+"��");
             }
           if(lv == 2 &&mon7.name.equals(monP.getName())) {
                monP = mon8;
                System.out.println("��"+monP.name+"���� ��ȭ�Ͽ���!"+"��");
             }
        
        } if (lv == 3) {
           EXP = 0;
            System.out.println("���ϸ��� �ִ� ������ �Ǿ���!!");
           if(lv == 3&&mon2.name.equals(monP.getName())) {
              monP = mon3;
              System.out.println("��"+monP.name+"���� ��ȭ�Ͽ���!"+"��");
           }
           if(lv == 3&&mon5.name.equals(monP.getName())) {
              monP = mon6;
              System.out.println("��"+monP.name+"���� ��ȭ�Ͽ���!"+"��");
           }
           if(lv == 3&&mon8.name.equals(monP.getName())) {
              monP = mon9;
              System.out.println("��"+monP.name+"���� ��ȭ�Ͽ���!"+"��");
           }
        }
        }

   }