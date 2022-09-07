/*
 * Slayt 24 - Choose an object from part 1 (Coin Sorting Mechanism Controller)
 * 
 * METHODS: SortCoin (coins[]) -> An array of coins are passed with each coin being an object
 * with attributes such as value, size and color.
 * 
 * changeCountingSpeed(percentage or amperes) -> A possible method to change the speed of the counting 
 * motor for not a reason I can clearly state, maybe for diagnostics?
 * 
 * ATTRIBUTES: CountingSpeed, Manufacturer, ServiceTime, Current, Voltage... -> Basically any 
 * data we may want to know about an electrical and mechanical machine.
 * 
 * Senaryo Oluşturma (Slayt 28) 
 * 
 * Consider a case where we have to manage outgoing and incoming buses at a bus terminal. We want to 
 * be able to access data about each bus and modify some values for each bus. To make this a simpler
 * task, we can create a bus class such that we can easily create separate bus instances for every bus
 * we are dealing with.
 * 
 * CLASS NAME: Bus
 * 
 * Fields: - Bus Model
 *         - Status (Incoming / Outgoing / Parked)
 *         - Position (GPS)
 *         - Passanger Count
 *         - Fuel Remaining
 *         - Coach Company
 *         - Ticket Price
 *         - Amount of Luggages
 *         - Total Loaded Weight
 *         - Probably some other data that I don't know because I haven't worked in this industry
 *         - Some of these fields may update automatically or after a method is called to update them
 * 
 * Methods : - changePassengerNumber(n)
 *           - changeLuggageNumber (n)
 *           - changeTicketPrice (n)
 *           - getFuelAmount
 *           - getPositionGPS
 *           - changeStatus (incoming, parked, outgoing)
 *           - estimateArrivalTime (position) -> This would probably be more advanced than just a method
 *             with a position parameter.
 *         
 * Implementation of the Class  
 */ 


public class classexample23{

    public class Bus {

        // FIELDS
        

        String busModel = "";
        private int status = 0; // could be 0 for incoming, 1 for parked and 2 for outgoing
        private double[] position = {0.0, 0.0}; 
        private int passengerCount = 0;
        private double fuelRemaining = 0.0;
        private String coachCompany = "";
        private double ticketPrice = 0.0;
        private int amountOfLuggages = 0;
        private double totalLoadedWeight = 0.0;

        // METHODS

        public int changePassengerNumber(n) {
            return passengerCount + n;
        } 

        public int changeLuggageNumber(n) {
            return amountOfLuggages + n; 
        }

        public int changeTicketPrice(n) {
            return ticketPrice + n;
        }

        public double getFuelAmount() {
            return fuel; // somehow it should get the fuel
        }

        public double[] getPositionGPS() {
            return position;
        }

        public int changeStatus(n) {
            return n;
        }

        public double[] estimateArrivalTime(n) {
            return estimatedArrivalTime;
        }

        // I don't care about the syntax errors because there are uninitialized variables and 
        // this language has horrendous class declaration that I don't have any clue about the intellisense error


    }
    public static void main(String[] args) {
        
        System.out.println("Example class");
    }
}

