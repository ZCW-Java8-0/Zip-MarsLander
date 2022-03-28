public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        int nextAlt = nextAltWithVelocity(status.getAltitude(), status.getVelocity(), burn);
        int alt = status.getAltitude();
        int fuel = status.Fuel;
        int vel = status.getVelocity();
        int stat = status.getStatus();
        boolean done = false;

        while(!done){
                if(alt < 400 && vel <200){
                    if(alt < 200 && vel < 50){
                        if(alt < 100 && vel < 25){
                            if(alt < 15 && vel < 10){
                                burn = targetVelocity(status.getVelocity(),2);
                                System.out.println(burn); /*hack!*/
                                return burn;
                            }
                            burn = targetVelocity(status.getVelocity(), 9);
                            System.out.println(burn); /*hack!*/
                            return burn;
                        }
                        burn = targetVelocity(status.getVelocity(), 24);
                        System.out.println(burn); /*hack!*/
                        return burn;
                    }
                    burn = targetVelocity(status.getVelocity(), 49);;
                    System.out.println(burn); /*hack!*/
                return burn;
                }

                if(burn == 200){
                    System.out.println(burn); /*hack!*/
                    return burn;
                }
                if(nextVelocityWithBurn(status.Velocity, burn) < calculateMaxVel(nextAlt)){
                    System.out.println(burn); /*hack!*/
                    return burn;
                }
                burn += 50;
        }

        System.out.println(burn); /*hack!*/
        return burn;
    }


    public int calculateMaxVel(int altitude) {
        return (int) Math.sqrt(200* altitude);
    }


    public int nextAltWithVelocity(int altitude, int velocity, int burn) {
        return altitude - (velocity + 100) + burn;
    }

    public int nextVelocityWithBurn(int velocity, int burn) {
        return velocity + 100 - burn;
    }

    public int targetVelocity(int velocityCurrent, int velocityTarget){
        return velocityCurrent+100-velocityTarget;
    }

}
