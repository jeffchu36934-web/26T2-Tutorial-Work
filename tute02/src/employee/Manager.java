package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hired;

    public Manager(String name, int salary, LocalDate hired) {
        super(name, salary);
        this.hired = hired;
    }

    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now());
    }

    public LocalDate getHired() {
        return hired;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hired:" + hired;
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null) return false;

        if (!super.equals(obj)) return false;

        Manager manager = (Manager) obj;

        if (hired.equals(manager.hired)) {
            return true;
        }

        return false;
    } 

    
    

}
