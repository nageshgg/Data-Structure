class Node():
    def __init__(self, value) -> None:
        self.next = None
        self.value = value


class LinkedList():

    def __init__(self) -> None:
        self.Llist = Node(0)

    def insert_value(self, value):
        newElement = Node(value)
        nextAdr = self.Llist

        while nextAdr.next != None:
            nextAdr = nextAdr.next
        
        nextAdr.next = newElement
        print(nextAdr.value)

    def printList(self):
        print('printing the value')
        nextAdr = self.Llist
        
        while nextAdr != None:
            print(nextAdr.value)
            nextAdr = nextAdr.next


List = LinkedList()

List.insert_value(20)
List.insert_value(10)

List.insert_value(810)
List.insert_value(103)


List.printList()