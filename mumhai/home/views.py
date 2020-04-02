from django.shortcuts import render
from django.http import HttpResponse
from .models import Destination

# Create your views here.
def add(request):
    val1=int(request.POST['n1'])
    val2=int(request.POST['n2'])
    res=val1+val2

    return render(request, 'result.html', {'result':res})

def index(request):

    dest1 = Destination()
    dest1.name = 'Mumbai'
    dest1.desc = "formerly known as Bombay"
    dest1.img =  'destination_1.jpg'
    dest1.price = 700
    dest1.offer = True

    dest2 = Destination()
    dest2.name = 'Indonesia'
    dest2.desc = 'beautiful beaches in Oceania'
    dest2.img = 'destination_2.jpg'
    dest2.price = 679
    dest2.offer = False

    dest3=Destination()
    dest3.name = 'San Fransisco'
    dest3.desc = 'The cultural center of Nothern California'
    dest3.img = 'destination_3.jpg'
    dest3.price  = 889
    dest3.offer = False

    dest4 = Destination()
    dest4.name = 'Paris'
    dest4.desc = 'Global center of art, fashion and gastronomy'
    dest4.img = 'destination_4.jpg'
    dest4.price = 1200
    dest4.offer = False

    dest5 = Destination()
    dest5.name = 'Phi Phi Islands'
    dest5.desc = 'Small island group in thailand'
    dest5.img = 'destination_5.jpg'
    dest5.price = 1099
    dest5.offer = False

    dest6=Destination()
    dest6.name = 'Mykonos'
    dest6.desc = 'Greek island that hosts summer parties'
    dest6.img = 'destination_6.jpg'
    dest6.price = 849
    dest6.offer = False

    dests = [dest1, dest2, dest3, dest4, dest5, dest6]

    return render(request, "index.html", {'dests': dests})

