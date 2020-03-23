from django.urls import path
from . import views

urlpatterns=[

    path('',views.home, name='home')                            #or use '/' depending on version
]