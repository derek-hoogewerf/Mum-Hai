from django.shortcuts import render, redirect
from django.contrib.auth.models import User, auth
from django.contrib import messages

# Create your views here.
def register(request):
    if(request.method == 'POST'):
        first_name = request.POST['first_name']
        last_name = request.POST['last_name']
        username = request.POST['username']
        password = request.POST['password']
        email = request.POST['email']

        if User.objects.filter(username=username).exists():
            messages.info(request, 'User name')
            return redirect('register')
        elif User.objects.filter(email=email).exists:
            messages.info(request, 'email already registered')
            return redirect('register')
        else:
            user = User.objects.create_user(username=username, password=password, email=email, first_name=first_name, last_name=last_name)
            user.save()
            print('user created')
            return redirect('/')
    else:
        return render(request, 'register.html')