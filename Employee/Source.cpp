#include <iostream>
#include <fstream>
using namespace std;

class Employee {
protected:
	double netSales;
private:
	int type;
	char EmpID[12];
	char DeptID[5];
public:
	virtual void input(ifstream& in) {
		in >> EmpID >> DeptID;
	}
	virtual void print()
	{
		cout << "Employee# " << EmpID << " Dept# " << DeptID;
	}
	virtual double calc() = 0;	
};

class Salaried : public Employee {
protected:
	double salary;
public:
	double netSalary;
	void input(ifstream& in) override {
		Employee::input(in);
		in >> salary;
	}
	
	double calc()override{
		netSalary = salary / 12;
		return netSalary;
	}

	 void print() override {
		 Employee::print();
		 cout << " Net Pay: $" << netSalary << " Salary: $" << salary << endl;
	}
};

class Hourly : public Employee {
protected:
	double rate;
	double hours;
public:
	
	double netHourly;
	void input(ifstream& in) override {
		Employee::input(in);
		 in >> hours >> rate;
	}
	 double calc() override
	{
		if (hours <= 40)
		{
			netHourly = hours * rate;
		}
		else
		{
			double overtime = hours - 40;
			double regWage = 40 * rate;
			double overWage = overtime * rate * 1.5;
			netHourly = regWage + overWage;
		}
		return netHourly;
	}

	 void print() override {
		 Employee::print();
		cout << " Net Pay: $" << netHourly << " Hours: " << hours << " Rate: $" << rate << endl;
	}

};

class Commission : public Employee {
protected:
	double sales;
public:
	double netSales;
	 void input(ifstream& in) override {
		 Employee::input(in);
		 in >> sales;	
	}

	 double calc() override
	{
		if (sales <= 15000)
		{
			netSales = sales * .12;
		}
		else if (sales > 15000 && sales <= 25000)
		{
			double mediumSales = sales - 1500;
			double mediumComission = mediumSales * .15;
			double smallCommision = 15000 * .12;
			netSales = mediumComission + smallCommision;
		}
		else
		{
			double largeSales = sales - 25000;
			double largeComission = largeSales * .2;
			double mediumComission = 10000 * .15;
			double smallCommision = 15000 * .12;
			netSales = largeComission + mediumComission + smallCommision;
		}
		return netSales;
	}

	 void print() override {
		 Employee::print();
		 cout << " Net Pay: $" << netSales << " Sales $" << sales << endl;
	}


};

// Factory Method
Employee* Emp(int type) {
	if (type == 1)
	{
		return new Salaried;
	}
	else if (type == 2)
	{
		return new Hourly;
	}
	else
	{
		return new Commission;
	}
}

int main() {

	int type;
	Employee *e;

	ifstream in;
	in.open("datafile.txt");
	if (!in.is_open())
	{
		cout << "error" << endl;
	}
	while (in >> type)
	{
		e = Emp(type);
		e->input(in);
		e->calc();
		e->print();
	}
	in.close();
	system("pause");
	return 0;
}