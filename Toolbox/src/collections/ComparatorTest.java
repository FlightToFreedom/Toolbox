package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author eiorio
 */

public class ComparatorTest
{

  static class ComparablePerson implements Comparable<ComparablePerson>
  {

    private String name;
    private int    age;

    // Build this
    public ComparablePerson(String name, int age)
    {
      this.name = name;
      this.age = age;
    }

    public String getName()
    {
      return name;
    }

    public int getAge()
    {
      return age;
    }

    /**
     * Sort based on age
     */
    @Override
    public int compareTo(ComparablePerson in)
    {
      if (age > in.age)
        return 1;
      if (age < in.age)
        return -1;
      return 0;
    }
  }

  /**
   * RUN!
   * 
   * @param args
   */
  public static void main(String... args)
  {
    List<ComparablePerson> persons = new ArrayList<ComparablePerson>() {
      {
        add(new ComparatorTest.ComparablePerson("James", 10));
        add(new ComparatorTest.ComparablePerson("Barbara", 2));
        add(new ComparatorTest.ComparablePerson("Shisho", 22));
        add(new ComparatorTest.ComparablePerson("Albert", 13));
      }
    };

    Collections.sort(persons);
    for (ComparablePerson person : persons)
    {
      System.out.println("Name " + person.getName() + " and Age: " + person.getAge());
    }
  }

}
