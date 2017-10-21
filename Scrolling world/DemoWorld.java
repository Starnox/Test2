import greenfoot.*;


public class DemoWorld extends ScrollWorld
{
    public DemoWorld()
    {
        super(1500, 1500, 1, 1500, 1500);

        prepare();
    }

    private void prepare()
    {

        addObject(new orizontal(),750,150);
        addObject(new vertical(),200,750);
        addObject(new orizontal(),750,1350);
        addObject(new vertical(),1300,750);

        Poteca_Orizontala poteca_orizontala = new Poteca_Orizontala();
        addObject(poteca_orizontala,321,376);
        Poteca_Orizontala poteca_orizontala2 = new Poteca_Orizontala();
        addObject(poteca_orizontala2,528,374);
        poteca_orizontala2.setLocation(521,375);
        Poteca_Orizontala poteca_orizontala3 = new Poteca_Orizontala();
        addObject(poteca_orizontala3,728,382);
        poteca_orizontala3.setLocation(721,375);
        Poteca_Verticala poteca_verticala = new Poteca_Verticala();
        addObject(poteca_verticala,862,449);
        poteca_verticala.setLocation(854,440);
        Poteca_Orizontala poteca_orizontala4 = new Poteca_Orizontala();
        addObject(poteca_orizontala4,997,378);
        poteca_orizontala4.setLocation(984,376);
        poteca_orizontala4.setLocation(985,375);
        Poteca_Orizontala poteca_orizontala5 = new Poteca_Orizontala();
        addObject(poteca_orizontala5,1163,373);
        poteca_orizontala5.setLocation(1177,374);
        poteca_orizontala5.setLocation(1185,375);
        Poteca_Verticala poteca_verticala2 = new Poteca_Verticala();
        addObject(poteca_verticala2,1357,291);
        poteca_verticala2.setLocation(1319,309);
        Poteca_Orizontala poteca_orizontala6 = new Poteca_Orizontala();
        addObject(poteca_orizontala6,1248,154);
        poteca_orizontala6.setLocation(1253,175);
        Poteca_Verticala poteca_verticala3 = new Poteca_Verticala();
        addObject(poteca_verticala3,1118,114);
        poteca_verticala3.setLocation(1118,110);
        Poteca_Verticala poteca_verticala4 = new Poteca_Verticala();
        addObject(poteca_verticala4,901,670);
        poteca_verticala4.setLocation(854,639);
        Poteca_Orizontala poteca_orizontala7 = new Poteca_Orizontala();
        addObject(poteca_orizontala7,729,692);
        poteca_orizontala7.setLocation(719,705);
        Poteca_Orizontala poteca_orizontala8 = new Poteca_Orizontala();
        addObject(poteca_orizontala8,520,711);
        poteca_orizontala8.setLocation(518,706);
        poteca_orizontala8.setLocation(520,705);
        Poteca_Verticala poteca_verticala5 = new Poteca_Verticala();
        addObject(poteca_verticala5,579,591);
        poteca_verticala5.setLocation(591,576);
        Poteca_Orizontala poteca_orizontala9 = new Poteca_Orizontala();
        addObject(poteca_orizontala9,326,715);
        poteca_orizontala9.setLocation(320,706);
        poteca_orizontala9.setLocation(320,705);
        Poteca_Verticala poteca_verticala6 = new Poteca_Verticala();
        addObject(poteca_verticala6,312,805);
        poteca_verticala6.setLocation(346,834);
        Poteca_Verticala poteca_verticala7 = new Poteca_Verticala();
        addObject(poteca_verticala7,350,1038);
        poteca_verticala7.setLocation(347,1032);
        Poteca_Orizontala poteca_orizontala10 = new Poteca_Orizontala();
        addObject(poteca_orizontala10,128,721);
        poteca_orizontala10.setLocation(126,704);
        Poteca_Verticala poteca_verticala8 = new Poteca_Verticala();
        addObject(poteca_verticala8,141,710);
        poteca_orizontala10.setLocation(125,705);
        Poteca_Orizontala poteca_orizontala11 = new Poteca_Orizontala();
        addObject(poteca_orizontala11,417,1173);
        poteca_orizontala11.setLocation(412,1164);
        Poteca_Orizontala poteca_orizontala12 = new Poteca_Orizontala();
        addObject(poteca_orizontala12,159,1171);
        poteca_orizontala12.setLocation(221,1164);
        Poteca_Verticala poteca_verticala9 = new Poteca_Verticala();
        addObject(poteca_verticala9,558,1233);
        poteca_verticala9.setLocation(547,1228);
        poteca_verticala9.setLocation(546,1229);
        Poteca_Orizontala poteca_orizontala13 = new Poteca_Orizontala();
        addObject(poteca_orizontala13,1011,711);
        poteca_orizontala13.setLocation(989,703);
        Poteca_Orizontala poteca_orizontala14 = new Poteca_Orizontala();
        addObject(poteca_orizontala14,1214,717);
        poteca_orizontala14.setLocation(1188,703);
        Poteca_Verticala poteca_verticala10 = new Poteca_Verticala();
        addObject(poteca_verticala10,1221,817);
        poteca_verticala10.setLocation(1211,837);
        Poteca_Verticala poteca_verticala11 = new Poteca_Verticala();
        addObject(poteca_verticala11,1216,1040);
        poteca_verticala11.setLocation(1211,1037);
        Poteca_Orizontala poteca_orizontala15 = new Poteca_Orizontala();
        addObject(poteca_orizontala15,1078,1037);
        poteca_orizontala15.setLocation(1078,1038);
        Poteca_Verticala poteca_verticala12 = new Poteca_Verticala();
        addObject(poteca_verticala12,948,988);
        poteca_verticala12.setLocation(943,973);
        Poteca_Orizontala poteca_orizontala16 = new Poteca_Orizontala();
        addObject(poteca_orizontala16,840,928);
        poteca_orizontala16.setLocation(808,909);
        Poteca_Orizontala poteca_orizontala17 = new Poteca_Orizontala();
        addObject(poteca_orizontala17,1379,704);
        poteca_orizontala17.setLocation(1378,702);
        Poteca_Orizontala poteca_orizontala18 = new Poteca_Orizontala();
        addObject(poteca_orizontala18,1346,1113);
        poteca_orizontala18.setLocation(1346,1102);
        Poteca_Verticala poteca_verticala13 = new Poteca_Verticala();
        addObject(poteca_verticala13,1228,1216);
        poteca_verticala13.setLocation(1211,1233);
        Poteca_Orizontala poteca_orizontala19 = new Poteca_Orizontala();
        addObject(poteca_orizontala19,1027,1304);
        poteca_orizontala19.setLocation(1076,1300);
        Poteca_Orizontala poteca_orizontala20 = new Poteca_Orizontala();
        addObject(poteca_orizontala20,765,1396);
        removeObject(poteca_orizontala20);
        Poteca_Verticala poteca_verticala14 = new Poteca_Verticala();
        addObject(poteca_verticala14,933,1236);
        poteca_verticala14.setLocation(941,1365);
        Poteca_Verticala poteca_verticala15 = new Poteca_Verticala();
        addObject(poteca_verticala15,498,1383);
        poteca_verticala15.setLocation(513,1375);
        Poteca_Orizontala poteca_orizontala21 = new Poteca_Orizontala();
        addObject(poteca_orizontala21,389,1470);
        poteca_orizontala21.setLocation(384,1442);
        Poteca_Orizontala poteca_orizontala22 = new Poteca_Orizontala();
        addObject(poteca_orizontala22,1374,1301);
        poteca_orizontala22.setLocation(1345,1299);
        Poteca_Verticala poteca_verticala16 = new Poteca_Verticala();
        addObject(poteca_verticala16,643,228);
        poteca_verticala16.setLocation(628,243);
        Poteca_Orizontala poteca_orizontala23 = new Poteca_Orizontala();
        addObject(poteca_orizontala23,567,115);
        poteca_orizontala23.setLocation(564,111);
        Poteca_Orizontala poteca_orizontala24 = new Poteca_Orizontala();
        addObject(poteca_orizontala24,752,100);
        poteca_orizontala24.setLocation(763,110);
        Poteca_Verticala poteca_verticala17 = new Poteca_Verticala();
        addObject(poteca_verticala17,195,449);
        poteca_verticala17.setLocation(186,442);
        Poteca_Orizontala poteca_orizontala25 = new Poteca_Orizontala();
        addObject(poteca_orizontala25,75,389);
        poteca_orizontala25.setLocation(107,378);
        Poteca_Verticala poteca_verticala18 = new Poteca_Verticala();
        addObject(poteca_verticala18,167,233);
        poteca_verticala18.setLocation(113,244);
        poteca_orizontala21.setLocation(382,1441);
        poteca_orizontala21.setLocation(381,1441);
        Poteca_Verticala poteca_verticala19 = new Poteca_Verticala();
        addObject(poteca_verticala19,1145,571);
        poteca_verticala19.setLocation(1142,573);
        fantana fantana = new fantana();
        addObject(fantana,857,977);
        fantana.setLocation(1319,1223);
        fantana.setLocation(1338,1230);
        fantana fantana2 = new fantana();
        addObject(fantana2,335,647);
        fantana2.setLocation(312,636);
        Copac_1 copac_1 = new Copac_1();
        addObject(copac_1,520,247);
        copac_1.setLocation(517,260);
        copac_4 copac_4 = new copac_4();
        addObject(copac_4,367,184);
        copac_4.setLocation(378,165);
        copac_3 copac_3 = new copac_3();
        addObject(copac_3,254,245);
        copac_3.setLocation(222,247);
        copac_3.setLocation(43,93);
        copac_2 copac_2 = new copac_2();
        addObject(copac_2,281,143);
        Copac_1 copac_12 = new Copac_1();
        addObject(copac_12,211,80);
        copac_2.setLocation(267,71);
        copac_12.setLocation(292,157);
        copac_12.setLocation(270,181);
        copac_4.setLocation(392,149);
        copac_12.setLocation(276,177);
        copac_2.setLocation(175,68);
        copac_4 copac_42 = new copac_4();
        addObject(copac_42,335,67);
        copac_12.setLocation(275,123);
        copac_42.setLocation(334,183);
        copac_4.setLocation(430,165);
        copac_12.setLocation(331,62);
        copac_42.setLocation(264,186);
        copac_42.setLocation(254,180);
        copac_4.setLocation(411,113);
        copac_12.setLocation(344,151);
        copac_12.setLocation(436,195);
        copac_4.setLocation(316,64);
        copac_12.setLocation(398,93);
        copac_42.setLocation(250,101);
        copac_3 copac_32 = new copac_3();
        addObject(copac_32,388,132);
        copac_32.setLocation(346,117);
        copac_2 copac_22 = new copac_2();
        addObject(copac_22,272,170);
        Copac_1 copac_13 = new Copac_1();
        addObject(copac_13,414,146);
        copac_13.setLocation(227,181);
        copac_13.setLocation(218,185);
        copac_22.setLocation(271,177);
        copac_22.setLocation(405,155);
        copac_13.setLocation(264,154);
        copac_13.setLocation(257,155);
        copac_4 copac_43 = new copac_4();
        addObject(copac_43,322,181);
        copac_43.setLocation(333,171);
        Copac_1 copac_14 = new Copac_1();
        addObject(copac_14,226,217);
        copac_14.setLocation(233,216);
        copac_14.setLocation(240,214);
        copac_13.setLocation(221,145);
        copac_2.setLocation(165,69);
        copac_3.setLocation(42,79);
        copac_3 copac_33 = new copac_3();
        addObject(copac_33,34,169);
        Copac_1 copac_15 = new Copac_1();
        addObject(copac_15,27,267);
        copac_15.setLocation(30,263);
        Copac_1 copac_16 = new Copac_1();
        addObject(copac_16,740,271);
        copac_16.setLocation(970,53);
        copac_2 copac_23 = new copac_2();
        addObject(copac_23,876,53);
        copac_23.setLocation(965,127);
        copac_3 copac_34 = new copac_3();
        addObject(copac_34,531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(531,116);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(503,12);
        copac_34.setLocation(466,5);
        copac_34.setLocation(474,4);
        copac_34.setLocation(480,1);
        copac_12.setLocation(394,45);
        copac_22.setLocation(413,131);
        Copac_1 copac_17 = new Copac_1();
        addObject(copac_17,680,66);
        copac_17.setLocation(558,19);
        copac_22.setLocation(413,136);
        copac_2 copac_24 = new copac_2();
        addObject(copac_24,666,74);
        copac_24.setLocation(649,21);
        copac_4 copac_44 = new copac_4();
        addObject(copac_44,743,129);
        copac_44.setLocation(733,23);
        copac_44.setLocation(733,23);
        copac_44.setLocation(733,23);
        copac_44.setLocation(733,23);
        copac_44.setLocation(733,23);
        copac_44.setLocation(736,4);
        copac_3 copac_35 = new copac_3();
        addObject(copac_35,831,98);
        copac_35.setLocation(818,9);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(814,0);
        copac_35.setLocation(863,0);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_35.setLocation(902,151);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(736,4);
        copac_44.setLocation(894,19);
        copac_44.setLocation(889,16);
        copac_35.setLocation(900,113);
        copac_4 copac_45 = new copac_4();
        addObject(copac_45,759,83);
        copac_45.setLocation(777,2);
        copac_45.setLocation(777,2);
        copac_45.setLocation(777,2);
        copac_45.setLocation(777,2);
        copac_45.setLocation(777,2);
        copac_45.setLocation(777,2);
        copac_45.setLocation(777,2);
        copac_45.setLocation(777,2);
        copac_45.setLocation(777,2);
                addObject(new Lumber(),400,350);
    }
}