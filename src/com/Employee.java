package com;

public class Employee {
int empId;
String name;
int age;
	public Employee(int empId, String name,int age) {
		// TODO Auto-generated constructor stub
		this.empId= empId;
		this.name=name;
		this.age=age;
	}
	/*@Override
	public int hashCode() {
	    return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
	        // if deriving: appendSuper(super.hashCode()).
	        append(name).
	        append(age).
	        toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
	   if (!(obj instanceof ObjectEquals))
	        return false;
	    if (obj == this)
	        return true;

	    ObjectEquals rhs = (ObjectEquals) obj;
	    return new EqualsBuilder().
	        // if deriving: appendSuper(super.equals(obj)).
	        append(name, rhs.name).
	        append(age, rhs.age).
	        isEquals();
	}*/
@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		return true;
		if((obj == null) || (obj.getClass() != this.getClass()))
			return false;
		// object must be Test at this point
		Employee test = (Employee)obj;
		return test.age==this.age && test.empId==this.empId && test.name.equals(this.name);
	}
@Override
	public int hashCode()
	{
		return this.empId;
	}

}
