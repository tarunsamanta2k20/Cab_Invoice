import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly
import org.junit.jupiter.api.Assertions

class Cab_Test : StringSpec() {
    init {

        "total distance travel is 1.1 kms and total time taken 0.1 units" {
            Cab_Invoice().calculateFair_Single(1.1,0.1) shouldBeExactly 11.1
        }
        "total distance travel is 10 kms and total time taken 1 units" {
            val rideOne = Ride(10.0, 1.0)
            val a=Cab_Invoice().calculateFair_Multi(listOf(rideOne));
            val b=arrayOf(101.0,1.0,101.0)
            Assertions.assertTrue(a contentEquals b)
        }

        "total distance travel is 7 km and total time taken 1 units" {
            val rideOne = Ride(3.0, 0.0)
            val rideTwo = Ride(2.0, 0.0)
            val rideThree=Ride(5.0,4.0)
            val a=Cab_Invoice().calculateFair_Multi(listOf(rideOne, rideTwo,rideThree));
            val b=arrayOf(104.0,3.0,34.666666666666664)
            Assertions.assertTrue(a contentEquals b)
        }

        /*
        "total distance travel is 0 kms and total time taken 0 units" {
           // val rideOne = Ride(10.0, 1.0)
            Cab_Invoice().calculateFair_Multi(listOf()) shouldBeExactly 0.0
        }












        /*


        "total distance travel is 1 km and total time taken 11 units" {
            val rideOne = Ride(0.0, 0.0)
            val rideTwo = Ride(1.0, 1.0)
            val rideThree  = Ride(0.0, 10.0)
            Cab_Invoice().calculateFair_Multi(listOf(rideOne, rideTwo, rideThree)) shouldBeExactly  21.0
        }

        "total distance travel is 20.5 km and total time taken 9 units" {
            val rideOne = Ride(10.0, 3.0)
            val rideTwo = Ride(9.0, 4.0)
            val rideThree  = Ride(1.5, 2.0)
            Cab_Invoice().calculateFair_Multi(listOf(rideOne, rideTwo, rideThree)) shouldBeExactly  214.0
        }
        */
         */





    }
}
