1. Creaet a class 
	Person
		- name
		- age
		- city
		
Person p1 = new Person("Ram",25,"Bengaluru")
Person p2 = new Person("Krishna",35,"Bengaluru")
Person p3 = new Person("Balaram",26,"Mysore")
Person p4 = new Person("Chaitanya",30,"Mysore")

List<Person> personList = Arrays.asList(p1,p2,p3,p4)
		
Create following predicates
i) Return True / False for a given object if age greater than 30
	Krishna age is greater than 30	
		
ii) Return True / False for a given object if age greater than 30 and city is Bengaluru
	Krishna age is greater than 30
		
iii) Print only names whose age is greater than 30 or Lives in Bengaluru