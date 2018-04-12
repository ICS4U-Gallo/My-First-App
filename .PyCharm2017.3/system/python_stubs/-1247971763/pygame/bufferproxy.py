# encoding: utf-8
# module pygame.bufferproxy
# from /usr/local/lib/python3.6/dist-packages/pygame/bufferproxy.cpython-36m-x86_64-linux-gnu.so
# by generator 1.145
"""
BufferProxy(<parent>) -> BufferProxy
pygame object to export a surface buffer through an array protocol
"""
# no imports

# no functions
# classes

class BufferProxy(object):
    """
    BufferProxy(<parent>) -> BufferProxy
    pygame object to export a surface buffer through an array protocol
    """
    def write(self, buffer, offset=0): # real signature unknown; restored from __doc__
        """
        write(buffer, offset=0)
        Write raw bytes to object buffer.
        """
        pass

    def __init__(self, *args, **kwargs): # real signature unknown; NOTE: unreliably restored from __doc__ 
        pass

    @staticmethod # known case of __new__
    def __new__(*args, **kwargs): # real signature unknown
        """ Create and return a new object.  See help(type) for accurate signature. """
        pass

    def __repr__(self, *args, **kwargs): # real signature unknown
        """ Return repr(self). """
        pass

    length = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """length -> int
The size, in bytes, of the exported buffer."""

    parent = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """parent -> Surface
parent -> <parent>
Return wrapped exporting object."""

    raw = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """raw -> bytes
A copy of the exported buffer as a single block of bytes."""

    __array_interface__ = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """Version 3 array interface, Python level"""

    __array_struct__ = property(lambda self: object(), lambda self, v: None, lambda self: None)  # default
    """Version 3 array interface, C level"""


    __dict__ = None # (!) real value is ''


# variables with complex values

_PYGAME_C_API = None # (!) real value is ''

__loader__ = None # (!) real value is ''

__spec__ = None # (!) real value is ''

