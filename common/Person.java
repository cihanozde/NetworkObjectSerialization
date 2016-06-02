package common;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L; //Versiyon numarası
	private String m_name;
	private int m_number;
	private boolean m_married;
	public Person(String name, int number, boolean married) {
		super();
		m_name = name;
		m_number = number;
		m_married = married;
	}
	public String getName()
	{
		return m_name;
	}
	public void setName(String name)
	{
		m_name = name;
	}
	public int getNumber()
	{
		return m_number;
	}
	public void setNumber(int number)
	{
		m_number = number;
	}
	public boolean isMarried()
	{
		return m_married;
	}
	public void setMarried(boolean married)
	{
		m_married = married;
	}
	@Override
	public String toString()
	{
		return String.format("[%d]-%s-%s", m_number, m_name, m_married ? "Evli" : "Bekar");
	}
	
}  

