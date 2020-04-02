from django.urls import path
from . import views

urlpatterns=[

    path('',views.index, name='index'),                            #or use '/' depending on version
    path('add',views.add, name='add'),
]