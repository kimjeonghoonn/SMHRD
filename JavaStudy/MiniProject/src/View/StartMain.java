package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Member_info;
import Controller.Playgame;
import Controller.Poc_image;
import Controller.SaveLoad;
import Model.pocketmon_default;

public class StartMain {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Member_info member = new Member_info();
      pocketmon_default monP = null;
      String id = null;
      
      while (true) {
    	  Poc_image main = new Poc_image();
          main.main();
         System.out.print("[1]ȸ������ [2]�α��� [3]���� >> ");
         int choice = sc.nextInt();

         if (choice == 2) {

            System.out.print("���̵� : ");
            id = sc.next();
            System.out.print("��й�ȣ : ");
            String pw = sc.next();

            if (member.login(id, pw) == 1) {
               System.out.println("�α��� ����");
               System.out.println("[1]�� ����  [2]�ҷ�����  >> ");
               int choice2 = sc.nextInt();
               if (choice2 == 2) {
                  SaveLoad ld = new SaveLoad();
                  monP = ld.Load(id);
                  break;
                  
                  } else if (choice2 == 1) {
                  System.out.println("���ο� ������ �����մϴ�.");

                  // ��Ÿ�� ���ϸ� ���� ������
                  //pocketmon_default monP;
                  pocketmon_default mon1 = new pocketmon_default("���α�", 1, 100, 100, 0, "�����ġ��", "level 2�� ����",
                        "level 3�� ����", id);
                  pocketmon_default mon4 = new pocketmon_default("���̸�", 1, 100, 100, 0, "ȭ�����", "level 2�� ����",
                        "level 3�� ����", id);
                  pocketmon_default mon7 = new pocketmon_default("�̻��ؾ�", 1, 100, 100, 0, "�����ġ��", "level 2�� ����",
                        "level 3�� ����", id);

                  Scanner mc = new Scanner(System.in);
                  System.out.println("��Ÿ�� ���ϸ��� ���ÿ�..");
                  System.out.println("1.[���α�] 2.[���̸�] 3.[�̻��ؾ�]");
                  System.out.print("�Է� >> ");
                  int selectP = mc.nextInt();
                  if (selectP == 1) {
                      Poc_image ggobuk = new Poc_image();
                            ggobuk.ggobuk();
                     System.out.println("���α⸦ �����ߴ�!");
                     monP = mon1;
                  } else if (selectP == 2) {
                     Poc_image piri = new Poc_image();
                            piri.piri();
                     System.out.println("���̸��� �����ߴ�!");
                     monP = mon4;
                  } else if (selectP == 3) {
                      Poc_image hae = new Poc_image();
                            hae.haessi();
                     System.out.println("�̻��ؾ��� �����ߴ�!");
                     monP = mon7;
                  }
                  break;
               }
            } else {
               System.out.println("�α��� ����. �ٽ� �õ����ֽʽÿ�.");
            }

         }

         if (choice == 1) {
            System.out.print("������ ���̵� : ");
            id = sc.next();
            System.out.print("������ ��й�ȣ : ");
            String pw = sc.next();
            member.join(id, pw);

         }
         if (choice == 3) {
            System.out.println("������ �����մϴ�.");
            break;
         }
        
      }

      Playgame play = new Playgame(monP, id);
      play.Play(null);
      

   }

}