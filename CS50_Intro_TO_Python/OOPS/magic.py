class Student9:
    def __init__(self, name, house, patronous):
        if not name:
            raise ValueError("missing name")
        if house not in ["Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"]:
            raise ValueError("Invalid house")
        self.name = name
        self.house = house
        self.patronous = patronous
    def __str__(self):
        return f"{self.name} from {self.house} has patronous {self.patronous}"

    def charm(self):
        match self.patronous:
            case "Stag":
                return "🦌"
            case "Otter":
                return "🦦"
            case "Jack Russel Terrier":
                return "🐩"
            case _:
                return "🖕🏽"

def main():
    student = get_student()
    print("Expecto Patronum!")
    print(student.charm())

def get_student():
    name = input("Name: ")
    house = input("House: ")
    patronous = input("Patronous: ")
    return Student9(name, house, patronous)


if __name__ =="__main__":
    main()