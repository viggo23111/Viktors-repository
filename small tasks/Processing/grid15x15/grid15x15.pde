size(450, 450);
background(255);

int y = 0;
int x = 30;
int spacing=30;

while (y<height) {
 stroke(0);
 line(0,y,width,y);
 y = y+spacing;
}
while (x<width) {
 stroke(0);
 line(x,0,x,height);
 x = x+spacing;
}
