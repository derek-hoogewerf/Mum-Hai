from django.urls import path
from . import views

urlpatterns=[
    path('register', views.register, name='register'),                            #or use '/' 
    path('login', views.login, name="login"),
]