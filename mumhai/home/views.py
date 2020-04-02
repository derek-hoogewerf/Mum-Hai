from django.shortcuts import render
from django.http import HttpResponse
from .models import Destination

# Create your views here.
"""def home(request):
    return render(request, 'home.html',{'name':'Derek'})"""

def add(request):
    val1=int(request.POST['n1'])
    val2=int(request.POST['n2'])
    res=val1+val2

    return render(request, 'result.html', {'result':res})

def index(request):

    dest1 = Destination()
    dest1.name = 'Mumbai'
    dest1.desc = "formerly known as Bombay"
    dest1.price = 700

    dest2 = Destination()
    dest2.name = 'Indonesia'
    dest2.desc = 'beautiful beaches in Oceania'
    dest2.price = 679

    dest3=Destination()
    dest3.name = 'San Fransisco'
    dest3.desc = 'The cultural center of Nothern California'
    dest3.price  = 889

    dest4 = Destination()
    dest4.name = 'Paris'
    dest4.desc = 'Global center of art, fashion and gastronomy'
    dest4.price = 1200

    dest5 = Destination()
    dest5.name = 'Phi Phi Islands'
    dest5.desc = 'Small island group in thailand'
    dest5.price = 1099

    dest6=Destination()
    dest6.name = 'Mykonos'
    dest6.desc = 'Greek island that hosts summer parties'
    dest6.price = 849


    return render(request, "index.html",{'dest1':dest1, 'dest2':dest2, 'dest3':dest3, 'dest4':dest4, 'dest5':dest5, 'dest6':dest6})

