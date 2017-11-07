/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {
    /**
     * the name of the employee.
     */
    private String name;

    /**
     * Manager of employees.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param newname the name of the employee
     * @param newmanager the name of the manager
     */
    public Employee(final String newname, final String newmanager) {
        this.name = newname;
        this.manager = newmanager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param newname the name of an employee
     */
    public void setName(final String newname) {
        this.name = newname;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param newmanager the name of the manager
     */
    public void setManager(final String newmanager) {
        this.manager = newmanager;
    }
}
