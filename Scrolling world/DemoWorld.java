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
        Lumber lum= new Lumber();
        addObject(lum,400,350);
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
       
        copac_3 copac_36 = new copac_3();
        addObject(copac_36,390,197);
        copac_4 copac_46 = new copac_4();
        addObject(copac_46,740,185);
        Copac_1 copac_18 = new Copac_1();
        addObject(copac_18,833,160);
        copac_46.setLocation(740,184);
        copac_46.setLocation(778,134);
        copac_3 copac_37 = new copac_3();
        addObject(copac_37,707,167);
        copac_2 copac_25 = new copac_2();
        addObject(copac_25,718,246);
        Copac_1 copac_19 = new Copac_1();
        addObject(copac_19,834,231);
        copac_25.setLocation(721,245);
        copac_25.setLocation(701,335);
        copac_19.setLocation(778,208);
        copac_25.setLocation(714,264);
        removeObject(copac_25);
        copac_2 copac_26 = new copac_2();
        addObject(copac_26,324,247);
        copac_3 copac_38 = new copac_3();
        addObject(copac_38,1031,146);
        copac_4 copac_47 = new copac_4();
        addObject(copac_47,966,199);
        Copac_1 copac_110 = new Copac_1();
        addObject(copac_110,886,212);
        copac_2 copac_27 = new copac_2();
        addObject(copac_27,715,266);
        copac_3 copac_39 = new copac_3();
        addObject(copac_39,834,244);
        copac_2 copac_28 = new copac_2();
        addObject(copac_28,935,259);
        copac_3 copac_310 = new copac_3();
        addObject(copac_310,1059,229);
        Copac_1 copac_111 = new Copac_1();
        addObject(copac_111,1131,133);
        copac_4 copac_48 = new copac_4();
        addObject(copac_48,1152,197);
        copac_2 copac_29 = new copac_2();
        addObject(copac_29,1079,18);
        removeObject(copac_1);
        copac_2 copac_210 = new copac_2();
        addObject(copac_210,509,172);
        Copac_1 copac_112 = new Copac_1();
        addObject(copac_112,443,232);
        copac_3 copac_311 = new copac_3();
        addObject(copac_311,547,222);
        Copac_1 copac_113 = new Copac_1();
        addObject(copac_113,124,154);
        copac_113.setLocation(123,154);
        copac_113.setLocation(137,190);
        copac_3 copac_312 = new copac_3();
        addObject(copac_312,787,387);
        copac_4 copac_49 = new copac_4();
        addObject(copac_49,605,380);
        Copac_1 copac_114 = new Copac_1();
        addObject(copac_114,706,426);
        copac_4 copac_410 = new copac_4();
        addObject(copac_410,786,475);
        copac_3 copac_313 = new copac_3();
        addObject(copac_313,663,497);
        copac_313.setLocation(802,566);
        copac_2 copac_211 = new copac_2();
        addObject(copac_211,674,490);
        removeObject(copac_313);
        Copac_1 copac_115 = new Copac_1();
        addObject(copac_115,730,531);
        copac_2 copac_212 = new copac_2();
        addObject(copac_212,670,580);
        copac_4 copac_411 = new copac_4();
        addObject(copac_411,782,574);
        copac_3 copac_314 = new copac_3();
        addObject(copac_314,1213,31);
        copac_4 copac_412 = new copac_4();
        addObject(copac_412,1247,122);
        copac_3 copac_315 = new copac_3();
        addObject(copac_315,1251,203);
        Copac_1 copac_116 = new Copac_1();
        addObject(copac_116,1337,38);
        copac_2 copac_213 = new copac_2();
        addObject(copac_213,1353,138);
        copac_3 copac_316 = new copac_3();
        addObject(copac_316,1437,173);
        Copac_1 copac_117 = new Copac_1();
        addObject(copac_117,1344,203);
        copac_2 copac_214 = new copac_2();
        addObject(copac_214,1414,282);
        Copac_1 copac_118 = new Copac_1();
        addObject(copac_118,1468,349);
        copac_3 copac_317 = new copac_3();
        addObject(copac_317,1407,355);
        copac_2 copac_215 = new copac_2();
        addObject(copac_215,1451,420);
        copac_3 copac_318 = new copac_3();
        addObject(copac_318,1472,516);
        copac_4 copac_413 = new copac_4();
        addObject(copac_413,1385,486);
        Copac_1 copac_119 = new Copac_1();
        addObject(copac_119,1433,591);
        copac_3 copac_319 = new copac_3();
        addObject(copac_319,1329,574);
        copac_2 copac_216 = new copac_2();
        addObject(copac_216,1255,495);
        copac_319.setLocation(1317,476);
        copac_3 copac_320 = new copac_3();
        addObject(copac_320,1346,564);
        copac_4 copac_414 = new copac_4();
        addObject(copac_414,1278,580);
        Copac_1 copac_120 = new Copac_1();
        addObject(copac_120,1211,573);
        copac_3 copac_321 = new copac_3();
        addObject(copac_321,1183,387);
        copac_2 copac_217 = new copac_2();
        addObject(copac_217,1080,471);
        Copac_1 copac_121 = new Copac_1();
        addObject(copac_121,999,403);
        copac_3 copac_322 = new copac_3();
        addObject(copac_322,929,462);
        copac_2 copac_218 = new copac_2();
        addObject(copac_218,1020,481);
        copac_4 copac_415 = new copac_4();
        addObject(copac_415,971,513);
        copac_3 copac_323 = new copac_3();
        addObject(copac_323,1057,533);
        Copac_1 copac_122 = new Copac_1();
        addObject(copac_122,928,587);
        copac_4 copac_416 = new copac_4();
        addObject(copac_416,1025,580);
        copac_3 copac_324 = new copac_3();
        addObject(copac_324,528,426);
        copac_2 copac_219 = new copac_2();
        addObject(copac_219,452,415);
        copac_4 copac_417 = new copac_4();
        addObject(copac_417,508,488);
        Copac_1 copac_123 = new Copac_1();
        addObject(copac_123,264,407);
        copac_3 copac_325 = new copac_3();
        addObject(copac_325,370,447);
        copac_219.setLocation(452,412);
        copac_325.setLocation(360,431);
        copac_2 copac_220 = new copac_2();
        addObject(copac_220,433,523);
        Copac_1 copac_124 = new Copac_1();
        addObject(copac_124,497,581);
        copac_2 copac_221 = new copac_2();
        addObject(copac_221,419,593);
        copac_4 copac_418 = new copac_4();
        addObject(copac_418,343,509);
        copac_3 copac_326 = new copac_3();
        addObject(copac_326,253,483);
        copac_326.setLocation(263,460);
        Copac_1 copac_125 = new Copac_1();
        addObject(copac_125,215,589);
        copac_4 copac_419 = new copac_4();
        addObject(copac_419,109,391);
        Copac_1 copac_126 = new Copac_1();
        addObject(copac_126,54,426);
        copac_2 copac_222 = new copac_2();
        addObject(copac_222,99,499);
        copac_3 copac_327 = new copac_3();
        addObject(copac_327,28,529);
        copac_2 copac_223 = new copac_2();
        addObject(copac_223,74,598);
        copac_3 copac_328 = new copac_3();
        addObject(copac_328,66,729);
        copac_4 copac_420 = new copac_4();
        addObject(copac_420,214,708);
        copac_2 copac_224 = new copac_2();
        addObject(copac_224,264,755);
        Copac_1 copac_127 = new Copac_1();
        addObject(copac_127,211,805);
        copac_4 copac_421 = new copac_4();
        addObject(copac_421,152,835);
        Copac_1 copac_128 = new Copac_1();
        addObject(copac_128,68,837);
        copac_3 copac_329 = new copac_3();
        addObject(copac_329,109,888);
        copac_4 copac_422 = new copac_4();
        addObject(copac_422,213,893);
        Copac_1 copac_129 = new Copac_1();
        addObject(copac_129,164,954);
        copac_2 copac_225 = new copac_2();
        addObject(copac_225,68,964);
        copac_3 copac_330 = new copac_3();
        addObject(copac_330,257,952);
        copac_2 copac_226 = new copac_2();
        addObject(copac_226,170,1020);
        copac_4 copac_423 = new copac_4();
        addObject(copac_423,82,1023);
        copac_3 copac_331 = new copac_3();
        addObject(copac_331,227,1023);
        copac_4 copac_424 = new copac_4();
        addObject(copac_424,423,766);
        copac_3 copac_332 = new copac_3();
        addObject(copac_332,508,758);
        copac_2 copac_227 = new copac_2();
        addObject(copac_227,467,830);
        Copac_1 copac_130 = new Copac_1();
        addObject(copac_130,600,752);
        copac_2 copac_228 = new copac_2();
        addObject(copac_228,569,828);
        copac_3 copac_333 = new copac_3();
        addObject(copac_333,501,860);
        copac_4 copac_425 = new copac_4();
        addObject(copac_425,424,891);
        Copac_1 copac_131 = new Copac_1();
        addObject(copac_131,568,889);
        copac_2 copac_229 = new copac_2();
        addObject(copac_229,661,822);
        copac_3 copac_334 = new copac_3();
        addObject(copac_334,757,730);
        copac_4 copac_426 = new copac_4();
        addObject(copac_426,843,742);
        copac_426.setLocation(841,720);
        copac_334.setLocation(720,732);
        copac_229.setLocation(660,889);
        copac_334.setLocation(685,729);
        removeObject(copac_229);
        copac_2 copac_230 = new copac_2();
        addObject(copac_230,669,822);
        copac_426.setLocation(775,728);
        copac_3 copac_335 = new copac_3();
        addObject(copac_335,758,775);
        Copac_1 copac_132 = new Copac_1();
        addObject(copac_132,855,750);
        copac_4 copac_427 = new copac_4();
        addObject(copac_427,852,774);
        copac_427.setLocation(820,784);
        copac_427.setLocation(954,706);
        copac_427.setLocation(951,702);
        copac_3 copac_336 = new copac_3();
        addObject(copac_336,971,781);
        copac_335.setLocation(729,773);
        copac_335.setLocation(745,772);
        copac_2 copac_231 = new copac_2();
        addObject(copac_231,1069,736);
        copac_4 copac_428 = new copac_4();
        addObject(copac_428,1143,783);
        Copac_1 copac_133 = new Copac_1();
        addObject(copac_133,1062,814);
        copac_3 copac_337 = new copac_3();
        addObject(copac_337,1150,890);
        copac_2 copac_232 = new copac_2();
        addObject(copac_232,1012,878);
        copac_4 copac_429 = new copac_4();
        addObject(copac_429,1089,915);
        copac_429.setLocation(1085,898);
        copac_3 copac_338 = new copac_3();
        addObject(copac_338,1299,752);
        copac_4 copac_430 = new copac_4();
        addObject(copac_430,1391,740);
        copac_2 copac_233 = new copac_2();
        addObject(copac_233,1357,819);
        Copac_1 copac_134 = new Copac_1();
        addObject(copac_134,1292,875);
        Copac_1 copac_135 = new Copac_1();
        addObject(copac_135,1454,846);
        copac_3 copac_339 = new copac_3();
        addObject(copac_339,1384,892);
        copac_2 copac_234 = new copac_2();
        addObject(copac_234,1309,960);
        copac_4 copac_431 = new copac_4();
        addObject(copac_431,1444,922);
        copac_2 copac_235 = new copac_2();
        addObject(copac_235,1398,1002);
        copac_4 copac_432 = new copac_4();
        addObject(copac_432,661,906);
        copac_3 copac_340 = new copac_3();
        addObject(copac_340,566,938);
        copac_2 copac_236 = new copac_2();
        addObject(copac_236,503,965);
        copac_4 copac_433 = new copac_4();
        addObject(copac_433,763,945);
        Copac_1 copac_136 = new Copac_1();
        addObject(copac_136,868,951);
        copac_2 copac_237 = new copac_2();
        addObject(copac_237,660,1005);
        copac_4 copac_434 = new copac_4();
        addObject(copac_434,866,1021);
        copac_3 copac_341 = new copac_3();
        addObject(copac_341,781,1047);
        copac_4 copac_435 = new copac_4();
        addObject(copac_435,448,1016);
        copac_3 copac_342 = new copac_3();
        addObject(copac_342,1401,1119);
        copac_2 copac_238 = new copac_2();
        addObject(copac_238,1319,1124);
        copac_3 copac_343 = new copac_3();
        addObject(copac_343,956,1031);
        copac_2 copac_239 = new copac_2();
        addObject(copac_239,1043,1083);
        Copac_1 copac_137 = new Copac_1();
        addObject(copac_137,1155,1051);
        copac_137.setLocation(1142,1054);
        copac_4 copac_436 = new copac_4();
        addObject(copac_436,1114,1113);
        Copac_1 copac_138 = new Copac_1();
        addObject(copac_138,967,1127);
        copac_4 copac_437 = new copac_4();
        addObject(copac_437,867,1101);
        copac_2 copac_240 = new copac_2();
        addObject(copac_240,691,1076);
        Copac_1 copac_139 = new Copac_1();
        addObject(copac_139,590,1059);
        copac_139.setLocation(559,1055);
        copac_3 copac_344 = new copac_3();
        addObject(copac_344,67,1137);
        copac_4 copac_438 = new copac_4();
        addObject(copac_438,49,1225);
        copac_2 copac_241 = new copac_2();
        addObject(copac_241,147,1197);
        Copac_1 copac_140 = new Copac_1();
        addObject(copac_140,126,1262);
        copac_3 copac_345 = new copac_3();
        addObject(copac_345,230,1198);
        Copac_1 copac_141 = new Copac_1();
        addObject(copac_141,67,1345);
        copac_2 copac_242 = new copac_2();
        addObject(copac_242,330,1205);
        copac_4 copac_439 = new copac_4();
        addObject(copac_439,450,1176);
        copac_439.setLocation(445,1176);
        copac_439.setLocation(427,1175);
        copac_3 copac_346 = new copac_3();
        addObject(copac_346,197,1297);
        copac_4 copac_440 = new copac_4();
        addObject(copac_440,287,1281);
        copac_2 copac_243 = new copac_2();
        addObject(copac_243,388,1276);
        copac_4 copac_441 = new copac_4();
        addObject(copac_441,152,1367);
        copac_3 copac_347 = new copac_3();
        addObject(copac_347,248,1402);
        Copac_1 copac_142 = new Copac_1();
        addObject(copac_142,351,1364);
        copac_4 copac_442 = new copac_4();
        addObject(copac_442,415,1397);
        copac_3 copac_348 = new copac_3();
        addObject(copac_348,643,1133);
        copac_2 copac_244 = new copac_2();
        addObject(copac_244,759,1156);
        copac_4 copac_443 = new copac_4();
        addObject(copac_443,852,1208);
        Copac_1 copac_143 = new Copac_1();
        addObject(copac_143,750,1237);
        copac_2 copac_245 = new copac_2();
        addObject(copac_245,655,1245);
        Copac_1 copac_144 = new Copac_1();
        addObject(copac_144,759,1350);
        copac_144.setLocation(780,1321);
        copac_4 copac_444 = new copac_4();
        addObject(copac_444,867,1415);
        copac_444.setLocation(799,1401);
        copac_444.setLocation(862,1345);
        copac_3 copac_349 = new copac_3();
        addObject(copac_349,803,1386);
        copac_2 copac_246 = new copac_2();
        addObject(copac_246,1036,1303);
        copac_3 copac_350 = new copac_3();
        addObject(copac_350,1125,1245);
        Copac_1 copac_145 = new Copac_1();
        addObject(copac_145,1235,1257);
        copac_4 copac_445 = new copac_4();
        addObject(copac_445,1167,1307);
        copac_3 copac_351 = new copac_3();
        addObject(copac_351,1076,1342);
        copac_2 copac_247 = new copac_2();
        addObject(copac_247,1244,1344);
        Copac_1 copac_146 = new Copac_1();
        addObject(copac_146,1348,1349);
        copac_4 copac_446 = new copac_4();
        addObject(copac_446,1439,1264);
        copac_2 copac_248 = new copac_2();
        addObject(copac_248,1165,1401);
        Copac_1 copac_147 = new Copac_1();
        addObject(copac_147,1298,1405);
        Copac_1 copac_148 = new Copac_1();
        addObject(copac_148,952,1415);
        copac_4 copac_447 = new copac_4();
        addObject(copac_447,1045,1405);
        removeObject(poteca_verticala18);
        removeObject(poteca_orizontala6);
        removeObject(poteca_verticala3);
        poteca_verticala2.setLocation(1320,374);
        poteca_verticala2.setLocation(1317,374);
        removeObject(poteca_orizontala22);
        poteca_orizontala19.setLocation(1078,1240);
        poteca_verticala14.setLocation(944,1304);
        poteca_verticala13.setLocation(1210,1175);
         Galeata galeata = new Galeata();
        addObject(galeata,289,556);
        lum.timer=0;
        poteca_orizontala21.setLocation(642,1440);

        
    }
}