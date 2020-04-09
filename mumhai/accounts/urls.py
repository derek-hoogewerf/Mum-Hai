from django.urls import path
from . import views

urlpatterns=[
    path('register',views.register, name='register'),                            #or use '/' depending on version
]