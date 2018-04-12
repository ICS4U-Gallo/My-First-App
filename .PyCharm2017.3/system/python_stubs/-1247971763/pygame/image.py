# encoding: utf-8
# module pygame.image
# from /usr/local/lib/python3.6/dist-packages/pygame/image.cpython-36m-x86_64-linux-gnu.so
# by generator 1.145
""" pygame module for image transfer """

# imports
from pygame.imageext import load, load_extended, save_extended


# functions

def frombuffer(string, size, format): # real signature unknown; restored from __doc__
    """
    frombuffer(string, size, format) -> Surface
    create a new Surface that shares data inside a string buffer
    """
    pass

def fromstring(string, size, format, flipped=False): # real signature unknown; restored from __doc__
    """
    fromstring(string, size, format, flipped=False) -> Surface
    create new Surface from a string buffer
    """
    pass

def get_extended(): # real signature unknown; restored from __doc__
    """
    get_extended() -> bool
    test if extended image formats can be loaded
    """
    return False

def load_basic(*args, **kwargs): # real signature unknown
    """
    load(filename) -> Surface
    load(fileobj, namehint=) -> Surface
    load new image from a file
    """
    pass

def save(Surface, filename): # real signature unknown; restored from __doc__
    """
    save(Surface, filename) -> None
    save an image to disk
    """
    pass

def tostring(Surface, format, flipped=False): # real signature unknown; restored from __doc__
    """
    tostring(Surface, format, flipped=False) -> string
    transfer image to string buffer
    """
    return ""

# no classes
# variables with complex values

__loader__ = None # (!) real value is ''

__spec__ = None # (!) real value is ''

