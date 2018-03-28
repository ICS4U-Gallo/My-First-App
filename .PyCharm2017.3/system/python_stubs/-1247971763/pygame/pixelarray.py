# encoding: utf-8
# module pygame.pixelarray
# from /usr/local/lib/python3.6/dist-packages/pygame/pixelarray.cpython-36m-x86_64-linux-gnu.so
# by generator 1.145
# no doc
# no imports

# no functions
# classes

class PixelArray(object):
    """
    PixelArray(Surface) -> PixelArray
    pygame object for direct pixel access of surfaces
    """
    def compare(self, array, distance=0, weights=0.2990): # real signature unknown; restored from __doc__
        """
        compare(array, distance=0, weights=(0.299, 0.587, 0.114)) -> PixelArray
        Compares the PixelArray with another one.
        """
        return PixelArray

    def extract(self, color, distance=0, weights=0.2990): # real signature unknown; restored from __doc__
        """
        extract(color, distance=0, weights=(0.299, 0.587, 0.114)) -> PixelArray
        Extracts the passed color from the PixelArray.
        """
        return PixelArray

    def make_surface(self): # real signature unknown; restored from __doc__
        """
        make_surface() -> Surface
        Creates a new Surface from the current PixelArray.
        """
        pass

    def replace(self, color, repcolor, distance=0, weights=0.2990): # real signature unknown; restored from __doc__
        """
        replace(color, repcolor, distance=0, weights=(0.299, 0.587, 0.114)) -> None
        Replaces the passed color in the PixelArray with another one.
        """
        pass

    def transpose(self): # real signature unknown; restored from __doc__
        """
        transpose() -> PixelArray
        Exchanges the x and y axis.
        """
        return PixelArray

    def __contains__(self, *args, **kwargs): # real signature unknown
        """ Return key in self. """
        pass

    def __delitem__(self, *args, **kwargs): # real signature unknown
        """ Delete self[key]. """
        pass

    def __getitem__(self, *args, **kwargs): # real signature unknown
        """ Return self[key]. """
        pass

    def __init__(self, Surface): # real signature unknown; restored from __doc__
        pass

    def __iter__(self, *args, **kwargs): # real signature unknown
        """ Implement iter(self). """
        pass

    def __len__(self, *args, **kwargs): # real signature unknown
        """ Return len(self). """
        pass

    @staticmethod # known case of __new__
    def __new__(*args, **kwargs): # real signature unknown
        """ Create and return a new object.  See help(type) for accurate signature. """
        pass

    def __repr__(self, *args, **kwargs): # real signature unknown
        """ Return repr(self). """
        pass

    def __setitem__(self, *args, **kwargs): # real signature unknown
        """ Set self[key] to value. """
        pass

    itemsize = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """itemsize -> int
Returns the byte size of a pixel array item"""

    ndim = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """ndim -> int
Returns the number of dimensions."""

    shape = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """shape -> tuple of int's
Returns the array size."""

    strides = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """strides -> tuple of int's
Returns byte offsets for each array dimension."""

    surface = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """surface -> Surface
Gets the Surface the PixelArray uses."""

    _pixels_address = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """pixel buffer address (readonly)"""

    __array_interface__ = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """Version 3"""

    __array_struct__ = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """Version 3"""


    __dict__ = None # (!) real value is ''


# variables with complex values

_PYGAME_C_API = None # (!) real value is ''

__loader__ = None # (!) real value is ''

__spec__ = None # (!) real value is ''

