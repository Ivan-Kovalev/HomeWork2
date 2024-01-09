package home.work_4;

public class task6 {
    public static void main(String[] args) {
        int placesAreOccupied = 14;
        int sitCapacity = 60;
        int Capacity = 102;
        int freeSitCapacity = sitCapacity - placesAreOccupied;
        int freeCapacity = Capacity - placesAreOccupied;
        if (freeCapacity >= 1) {
            System.out.println("В вагоне осталось " + freeCapacity + " мест");
        } else {
            System.out.println("Стоячих мест нет");
        }
        if (freeSitCapacity >= 1) {
            System.out.println("Из них " + freeSitCapacity + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
    }
}
