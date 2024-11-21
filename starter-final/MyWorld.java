// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Canon canon =  new  Canon();
        addObject(canon, 95, 92);
        Canon canon2 =  new  Canon();
        addObject(canon2, 321, 277);
        Canon canon3 =  new  Canon();
        addObject(canon3, 692, 107);
        Canon canon4 =  new  Canon();
        addObject(canon4, 708, 478);
        Canon canon5 =  new  Canon();
        addObject(canon5, 497, 52);
        canon3.setLocation(730, 171);
        canon2.setLocation(289, 316);
        CannonBall cannonBall =  new  CannonBall();
        addObject(cannonBall, 262, 101);
        CannonBall cannonBall2 =  new  CannonBall();
        addObject(cannonBall2, 361, 103);
        CannonBall cannonBall3 =  new  CannonBall();
        addObject(cannonBall3, 487, 134);
        cannonBall3.setLocation(494, 136);
        CannonBall cannonBall4 =  new  CannonBall();
        addObject(cannonBall4, 496, 195);
        CannonBall cannonBall5 =  new  CannonBall();
        addObject(cannonBall5, 448, 296);
        CannonBall cannonBall6 =  new  CannonBall();
        addObject(cannonBall6, 616, 170);
        CannonBall cannonBall7 =  new  CannonBall();
        addObject(cannonBall7, 603, 480);
        CannonBall cannonBall8 =  new  CannonBall();
        addObject(cannonBall8, 423, 479);
        CannonBall cannonBall9 =  new  CannonBall();
        addObject(cannonBall9, 191, 473);
        FinishLocation finishLocation =  new  FinishLocation();
        addObject(finishLocation, 75, 324);
        canon3.setRotation(180);
        canon4.setLocation(737, 479);
        canon4.setRotation(180);
        canon5.setRotation(90);
        cannonBall5.setLocation(415, 318);
        cannonBall4.setLocation(496, 211);
        cannonBall5.setLocation(404, 303);
        CannonBall cannonBall10 =  new  CannonBall();
        addObject(cannonBall10, 643, 315);
        cannonBall10.setLocation(627, 314);
        cannonBall5.setLocation(391, 316);
        cannonBall10.setLocation(628, 318);
        cannonBall6.setLocation(616, 177);
        cannonBall.setLocation(220, 103);
        cannonBall2.setLocation(338, 94);
        Ladybug ladybug =  new  Ladybug();
        addObject(ladybug, 699, 58);
        ladybug.setLocation(710, 61);
        ladybug.turn(90);
        ladybug.turn(90);
        ladybug.setLocation(707, 66);
        finishLocation.setLocation(37, 554);
        cannonBall2.setLocation(410, 96);
        cannonBall.setLocation(194, 102);
        cannonBall3.turn(90);
        cannonBall4.turn(90);
        cannonBall4.setLocation(498, 358);
        cannonBall6.turn(180);
        cannonBall7.turn(180);
        cannonBall8.turn(180);
        cannonBall8.setLocation(373, 482);
        cannonBall9.setLocation(110, 480);
        cannonBall9.turn(180);
        cannonBall2.setLocation(394, 105);
        cannonBall3.setLocation(496, 84);
        cannonBall4.setLocation(510, 265);
        cannonBall4.setLocation(505, 233);
        cannonBall4.setLocation(501, 233);
        finishLocation.setLocation(55, 536);
        finishLocation.setLocation(46, 538);
        finishLocation.setLocation(50, 565);
        finishLocation.setLocation(50, 565);
        cannonBall4.setLocation(505, 281);
        Canon canon6 =  new  Canon();
        addObject(canon6, 46, 431);
        CannonBall cannonBall11 =  new  CannonBall();
        addObject(cannonBall11, 97, 431);
        CannonBall cannonBall12 =  new  CannonBall();
        addObject(cannonBall12, 352, 430);
        Canon canon7 =  new  Canon();
        addObject(canon7, 194, 25);
        canon7.turn(90);
        CannonBall cannonBall13 =  new  CannonBall();
        addObject(cannonBall13, 193, 63);
        CannonBall cannonBall14 =  new  CannonBall();
        addObject(cannonBall14, 193, 185);
        CannonBall cannonBall15 =  new  CannonBall();
        addObject(cannonBall15, 191, 306);
        cannonBall13.turn(90);
        cannonBall14.turn(90);
        cannonBall15.turn(90);
    }
}
