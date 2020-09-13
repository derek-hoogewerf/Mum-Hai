from django.http import request
from django.shortcuts import redirect, render
from django.http import HttpResponse
from .models import Destination

# Create your views here.
def add(request):
    val1=int(request.POST['n1'])
    val2=int(request.POST['n2'])
    res=val1+val2

    return render(request, 'result.html', {'result':res})

def index(request):

    dests = Destination.objects.all();
    return render(request, "index.html", {'dests': dests})



