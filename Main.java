class Main {
 int c, i, p;
  QueuePriority finalUser;
  do {
      cout<<"1:add\n";
      cout<<"2:view\n";
      cout<<"3: delete\n";

      cout<<"which num 1-3 ";
      cin>>c;
      switch(c) {
          case 1:
          cout<<"Input the item value to be added in the queue : ";
          cin>>i;
          cout<<"Priority?! ";
          cin>>p;
          finalUser.add(i, p);
          break;
          case 2:
          finalUser.view();
          break;
          break;
          case 3:
          finalUser.del();
          break;




          }
      }
  while(c != 4);
  return 0;
  PUBLIC void del() {
nodey *value;
if(nullifyIt == NULL)
cout<<"Queue Underflow\n";
else {
value = nullifyIt;
cout<<"Deleted item is: "<<value->valueInput<<endl;
nullifyIt = nullifyIt->letit;
free(value);
}
}
}