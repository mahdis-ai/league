



import java.util.Random;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Team t[] = new Team[5];
        for (int i = 0; i < 5; i++) {
            t[i] = new Team();
        }
        t[0].setName("juventus");
        t[1].setName("intermilan");
        t[2].setName("napoli");
        t[3].setName("acmilan");
        t[4].setName("asrome");
        Random r[] = new Random[5];
        Random d = new Random();
        Random m = new Random();
        Date date[]=new Date[5];
        for (int i = 0; i < 5; i++) {
            r[i] = new Random();
        }
        int a=0;
        int b = 0;
        int j;
        for (int i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                /* har bar 2 gol betor tasadofi entekhab shode va ba ham moghayese mishavand va
                tebgh in be tim ha emtiaz va gole zade va khorde taallogh migirad */
                if (i == j) {
                    j++;
                }
                if (r[i].nextInt(100) <= 60) {
                    a = r[i].nextInt(3);
                }
                if (r[i].nextInt() <= 90 && r[i].nextInt() > 60) {
                    int min = 4;
                    int max = 5;
                    a = r[i].nextInt(max - min + 1) + min;
                }
                if (r[i].nextInt() <= 100 && r[i].nextInt() > 90) {
                    int min = 6;
                    int max = 9;
                    a = r[i].nextInt(max - min + 1) + min;
                }
                if (j >= 5) break;
                if (r[j].nextInt(100) <= 60) {
                    b = r[j].nextInt(3);
                }
                if (r[j].nextInt() <= 90 && r[i].nextInt() > 60) {
                    int min = 4;
                    int max = 5;
                    b = r[j].nextInt(max - min + 1) + min;
                }
                if (r[i].nextInt() > 90 && r[i].nextInt() <= 100) {

                    int min = 6;
                    int max = 9;
                    b = r[j].nextInt(max - min + 1) + min;
                }
                if (a>b) {
                    t[i].emtiaz += 3;
                    t[i].win++;
                    t[j].lose++;
                    t[i].golekhorde += b;
                    t[j].golezade += b;
                    t[j].golekhorde += a;
                    t[i].golezade += a;}

                else {
                    if (a == b) {
                        t[i].golekhorde += b;
                        t[j].golekhorde += a;
                        t[i].golezade += a;
                        t[j].golezade += b;
                        t[i].equal++;
                        t[j].equal++;
                        t[i].emtiaz++;
                        t[j].emtiaz++;
                    } else {

                        t[j].win++;
                        t[i].lose++;
                        t[j].emtiaz += 3;
                        t[i].golekhorde += b;
                        t[j].golekhorde += a;
                        t[i].golezade += a;
                        t[j].golezade += b;
                    }
                }
                /*chap natayej har bazi*/
                System.out.println("host" + " " + t[i].getName() + " " + a + " - " + b + " " + t[j].getName());
                date[j]=new Date(2018,m.nextInt(),d.nextInt(31));
                System.out.println(date[j]);
                System.out.println("******************************************************************");
            }

        }
        for(
                int i = 0;
                i< 4;i++)

        {
            for (int k = i + 1; k < 5; k++) {
                String temp;
                if (t[k].emtiaz > t[i].emtiaz) {
                    temp = t[i].getName();
                    t[i].setName(t[k].getName());
                    t[k].setName(temp);
                    int p;
                    p = t[i].emtiaz;
                    t[i].emtiaz = t[k].emtiaz;
                    t[k].emtiaz = p;

                    p = t[i].win;
                    t[i].win = t[k].win;
                    t[k].win = p;

                    p = t[i].lose;
                    t[i].lose = t[k].lose;
                    t[k].lose = p;

                    p = t[i].equal;
                    t[i].equal = t[k].equal;
                    t[k].equal = p;

                    p = t[i].golekhorde;
                    t[i].golekhorde = t[k].golekhorde;
                    t[k].golekhorde = p;

                    p = t[i].golezade;
                    t[i].golezade = t[k].golezade;
                    t[k].golezade = p;


                }
                if (t[k].emtiaz == t[i].emtiaz) {
                    if (t[k].golezade > t[i].golezade) {
                        temp = t[i].getName();
                        t[i].setName(t[k].getName());
                        t[k].setName(temp);
                        int p;
                        p = t[i].emtiaz;
                        t[i].emtiaz = t[k].emtiaz;
                        t[k].emtiaz = p;

                        p = t[i].win;
                        t[i].win = t[k].win;
                        t[k].win = p;

                        p = t[i].lose;
                        t[i].lose = t[k].lose;
                        t[k].lose = p;

                        p = t[i].equal;
                        t[i].equal = t[k].equal;
                        t[k].equal = p;

                        p = t[i].golekhorde;
                        t[i].golekhorde = t[k].golekhorde;
                        t[k].golekhorde = p;

                        p = t[i].golezade;
                        t[i].golezade = t[k].golezade;
                        t[k].golezade = p;

                    } else break;
                }

            }
        }
        /* chap jadval league*/
        for(int l = 0; l< 5;l++) {
            System.out.print(t[l].getName() + " ");
            System.out.print("emtiaz" + ":" + t[l].emtiaz + " ");
            System.out.print("bord" + ":" + t[l].win + " ");
            System.out.print("mosavi" + ":" + t[l].equal + " ");
            System.out.print("bakht" + ":" + t[l].lose + " ");
            System.out.print("golezade" + ":" + t[l].golezade + " ");
            System.out.println("golekhorde" + ":" + t[l].golekhorde + " ");
        }

    }

}
