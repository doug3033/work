goog.provide("rokko.graphics.Image");

goog.require("goog.dom");

/**
 *
 * @param {string} img
 * @param {Object} options
 * @constructor
 */
rokko.graphics.Image = function (img, options) {
   /**
    * @protected
    * @type {HTMLImageElement}
    */
   this.img = goog.dom.createDom("img", {src: img});

   options = options || {};

   /** @protected */
   this.pos = options.pos;

   /** @protected */
   this.size = options.size;
};

/**
 *
 * @param {number} time
 * @returns {HTMLImageElement}
 */
rokko.graphics.Image.prototype.getElement = function (time) {
   return this.img;
};

rokko.graphics.Image.prototype.getPos = function () {
   return this.pos;
};

rokko.graphics.Image.prototype.getSize = function () {
   return this.size;
};
